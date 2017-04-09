package com.pushpendra.assignment.Girl;

import com.pushpendra.assignment.Person.Person;

import java.util.Random;

/**
 * Created by panther on 23/2/17.
 */
public abstract class Girl extends Person{
    public double maintenanceCost;
    Random r = new Random();

    /**
     *
     * @param name
     * @param attractiveness
     * @param intelligence
     * @param maintenanceBudget
     */
    public Girl(String name, double attractiveness, double intelligence, double maintenanceBudget) {
        super(name, attractiveness, intelligence);
        this.maintenanceCost = maintenanceBudget * r.nextDouble();
    }
}
