package org.example;

public class Main {
    public static void main(String[] args) {
        String[] pricesCSV = new String[]{"106,EUR/USD,1.1000,1.2000,01-06-2020 12:01:01:001", "107,EUR/JPY,119.60,119.90,01-06-2020 12:01:02:002", "108,GBP/USD,1.2500,1.2560,01-06-2020 12:01:02:002", "109,GBP/USD,1.2499,1.2561,01-06-2020 12:01:02:100", "110,EUR/JPY,119.61,119.91,01-06-2020 12:01:02:110"};

        Subscriber subList = new Subscriber();

        for (String price : pricesCSV) {
            subList.addMessage(new Price(price));
        }

        subList.printMessages();
    }
}