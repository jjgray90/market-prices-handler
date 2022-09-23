package org.example;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Price priceOne = new Price("106,EUR/USD,1.1000,1.2000,01-06-2020 12:01:01:001");
        Price priceTwo = new Price("107, EUR/JPY, 119.60,119.90,01-06-2020 12:01:02:002");
        Price priceThree = new Price("108, GBP/USD, 1.2500,1.2560,01-06-2020 12:01:02:002");
        Price priceFour = new Price("109, GBP/USD, 1.2499,1.2561,01-06-2020 12:01:02:100");
        Price priceFive = new Price("110, EUR/JPY, 119.61,119.91,01-06-2020 12:01:02:110");


        Subscriber subList = new Subscriber();



        System.out.println(priceOne);

        subList.addMessage(priceOne);
        subList.addMessage(priceTwo);
        subList.addMessage(priceThree);
        subList.addMessage(priceFour);
        subList.addMessage(priceFive);

        System.out.println(subList);
    }
}