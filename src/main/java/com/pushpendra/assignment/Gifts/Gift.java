package com.pushpendra.assignment.Gifts;

import java.util.Random;

/**
 * Created by panther on 23/2/17.
 */
public class Gift {
    public String type;
    public String name;
    public Double price;
    public Double value;
    Double rating;
    Double difficulty;
    Double utilityValue;
    String utilityClass;
    Random r = new Random();

    /**
     *
     * @param type
     * @param name
     * @param price
     * @param value
     */
    public Gift(String type, String name, Double price, Double value) {
        this.type = type;
        this.name = name;
        this.price = price * r.nextDouble();
        this.value = value * r.nextDouble();
    }

    /**
     *
     * @param type
     * @param name
     * @param price
     * @param value
     * @param rating
     * @param difficulty
     */
    public Gift(String type, String name, Double price, Double value, Double rating, Double difficulty) {
        this.type = type;
        this.name = name;
        this.price = price * r.nextDouble();
        this.value = value * r.nextDouble();
        this.rating = rating * r.nextDouble();
        this.difficulty = difficulty * r.nextDouble();
    }

    /**
     *
     * @param type
     * @param name
     * @param price
     * @param value
     * @param utilityValue
     * @param utilityClass
     */
    public Gift(String type, String name, Double price, Double value, Double utilityValue, String utilityClass) {
        this.type = type;
        this.name = name;
        this.price = price * r.nextDouble();
        this.value = value * r.nextDouble();
        this.utilityValue = utilityValue * r.nextDouble();
        this.utilityClass = utilityClass;
    }


}
