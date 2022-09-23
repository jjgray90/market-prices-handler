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

    public void printMessages() {
        for(Price price : subscriberMessages) {
            System.out.println(price);
        }
    }
}
