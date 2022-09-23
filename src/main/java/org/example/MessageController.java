package org.example;

public class MessageController {
    /*


REST endpoint examples for both adding prices to, and getting prices back from database.
 - Spring boot framework is being used
 - a messageService class is being used as an intermediary between the messageRepository and this controller.

    @Autowired
    MessageService messageService;

    @PostMapping("/add-message")
    public ResponseEntity<?> createMessage(Price price) {
        try {
            Price newPrice = messageService.createPrice(price);
            return ResponseEntity.status(HttpStatus.OK).body(newPrice);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping("/get-messages")
    public ResponseEntity<List<Price>> getMessages() {
        List<Price> prices = messageService.findAllPrices();
        return ResponseEntity.status(HttpStatus.OK).body(prices);
    }
*/
}
