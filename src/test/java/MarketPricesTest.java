import org.example.Price;
import org.example.Subscriber;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class MarketPricesTest {

    private Subscriber testSub;
    private Price testPrice;
    private Price testPriceTwo;

    @BeforeAll
    public static void initialise() {
        System.out.println("Welcome to the market prices handler testing");
    }

    @AfterAll
    public static void complete() {
        System.out.println("All tests are complete");
    }

    @BeforeEach
    void setUp() {
        testPrice = new Price("106,EUR/USD,1.1000,1.2000,01-06-2020 12:01:01:001");
        testPriceTwo = new Price("112,EUR/USD,1.1340,1.4500,01-06-2020 12:02:01:001");
        testSub = new Subscriber();
    }

    @AfterEach
    void tidyUp() {
        System.out.println("Test passed");
    }

    @Test
    @DisplayName("Test message is split correctly")
    void checkMessage() {
        assertEquals(106, testPrice.getId());
        assertEquals("EUR/USD", testPrice.getInstrument());
        assertEquals(1.1000, testPrice.getBid());
        assertEquals(1.2000, testPrice.getAsk());
        assertEquals("01-06-2020 12:01:01:001", testPrice.getTimestamp());
    }

    @Test
    @DisplayName("Test exception if bid < ask")
    void checkException() {
        assertThrows(IllegalArgumentException.class, () -> testPrice = new Price("106,EUR/USD,1.3000,1.2000,01-06-2020 12:01:01:001"));
    }

    @Test
    @DisplayName("Test commission is calculated correctly")
    void checkCommission() {
        assertEquals(1.089, testPrice.getBidWithCommission());
        assertEquals(1.212, testPrice.getAskWithCommission());
    }

    @Test
    @DisplayName("Test historical prices are overwritten")
    void checkDuplicates() {
        testSub.addMessage(testPrice);
        testSub.addMessage(testPriceTwo);
        assertEquals(1, testSub.getSubscriberMessages().size());
        assertEquals(112, testSub.getSubscriberMessages().get(0).getId());
    }
}
