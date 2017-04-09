package com.pushpendra.assignment.Boy;

import com.pushpendra.assignment.Person.Person;

import java.util.Random;

/**
 * Created by panther on 23/2/17.
 */
public abstract class Boy extends Person{
    public double budget;
    Random r = new Random();

    /**
     *
     * @param name
     * @param attractiveness
     * @param intelligence
     * @param budget
     */
    public Boy(String name, double  attractiveness, double intelligence, double budget) {
        super(name, attractiveness, intelligence);
        this.budget = budget * r.nextDouble() + 100.00;
    }
}
