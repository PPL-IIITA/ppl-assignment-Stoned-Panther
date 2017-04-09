package com.pushpendra.assignment.Person;

import java.util.Random;

/**
 * Created by panther on 23/2/17.
 */
public abstract class Person {
    public String name;
    public double attractiveness;
    public double intelligence;
    Random r = new Random();

    /**
     *
     * @param name
     * @param attractiveness
     * @param intelligence
     */
    public Person(String name, double attractiveness, double intelligence) {
        this.name = name;
        this.attractiveness = attractiveness * r.nextDouble();
        this.intelligence = intelligence * r.nextDouble();
    }
}
