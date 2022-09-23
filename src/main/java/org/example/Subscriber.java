package org.example;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {
    private final List<Price> subscriberMessages = new ArrayList<>();

    public void addMessage(Price message) {
        for (int i = 0; i < subscriberMessages.size(); i++) {
            if (message.getInstrument().equals(subscriberMessages.get(i).getInstrument())) {
                subscriberMessages.remove(subscriberMessages.get(i));
            }
        }
        subscriberMessages.add(message);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Subscriber{");
        sb.append("subscriberMessages=").append(subscriberMessages);
        sb.append('}');
        return sb.toString();
    }
}
