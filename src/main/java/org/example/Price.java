package org.example;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


public class Price {

    private int id;
    private String instrument;
    private double bid;
    private double ask;
    private String timestamp;
    private double bidWithCommission;
    private double askWithCommission;

    public Price(String msg) throws IllegalArgumentException {
        String[] msgArr = msg.split(",");
        this.id = parseInt(msgArr[0]);
        this.instrument = msgArr[1];
        this.bid = parseDouble(msgArr[2]);
        this.ask = parseDouble(msgArr[3]);
        this.timestamp = msgArr[4];
        this.bidWithCommission = (parseDouble(msgArr[2]) * 0.99);
        this.askWithCommission = (parseDouble(msgArr[3]) * 1.01);

        if (ask < bid) {
            throw new IllegalArgumentException("Ask cannot be lower than Bid");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public double getAsk() {
        return ask;
    }

    public void setAsk(double ask) {
        this.ask = ask;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public double getBidWithCommission() {
        return bidWithCommission;
    }

    public void setBidWithCommission(double bidWithCommission) {
        this.bidWithCommission = bidWithCommission;
    }

    public double getAskWithCommission() {
        return askWithCommission;
    }

    public void setAskWithCommission(double askWithCommission) {
        this.askWithCommission = askWithCommission;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Price{");
        sb.append("id=").append(id);
        sb.append(", instrument='").append(instrument).append('\'');
        sb.append(", bid=").append(bidWithCommission);
        sb.append(", ask=").append(askWithCommission);
        sb.append(", timestamp='").append(timestamp).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
