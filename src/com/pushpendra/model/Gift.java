package com.pushpendra.model;

/**
 * Created by panther on 24/2/17.
 */
public class Gift {
    public char type;
    String name;
    public Double price;
    public Double value;
    Double rating;
    Double difficulty;
    Double utilityValue;
    String utilityClass;

    public Gift(char type, String name, Double price, Double value) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.value = value;
    }

    public Gift(char type, String name, Double price, Double value, Double rating, Double difficulty) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.value = value;
        this.rating = rating;
        this.difficulty = difficulty;
    }

    public Gift(char type, String name, Double price, Double value, Double utilityValue, String utilityClass) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.value = value;
        this.utilityValue = utilityValue;
        this.utilityClass = utilityClass;
    }


}
