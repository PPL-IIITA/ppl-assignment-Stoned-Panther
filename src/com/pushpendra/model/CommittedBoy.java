package com.pushpendra.model;

import java.util.Random;

/**
 * Created by panther on 24/2/17.
 */
public class CommittedBoy {
    //attributes of boy
    public String status, type;
    public String name;
    public double attractivness;
    public double intelligence;
    public double budget;
    public double min_attr_req;
    double happiness = 0.00;
    public CommittedGirl girlfriend;
    Random r = new Random();

    /**
     *
     * @param status
     * @param type
     * @param name
     * @param attractivness
     * @param intelligence
     * @param budget
     * @param min_attr_req
     * @param happiness
     * @param girlfriend
     */
    public CommittedBoy(String status, String type, String name, double attractivness, double intelligence, double budget, double min_attr_req, double happiness, CommittedGirl girlfriend) {
        this.status = status;
        this.type = type;
        this.name = name;
        this.attractivness = attractivness * r.nextDouble();
        this.intelligence = intelligence * r.nextDouble();
        this.budget = budget * r.nextDouble();
        this.min_attr_req = min_attr_req * r.nextDouble();
        this.happiness = happiness * r.nextDouble();
        this.girlfriend = girlfriend;
    }

    /**
     *
     * @param girl
     * @param gift
     */
    public void countHappiness(CommittedGirl girl, Gift gift) {
        if (type.equals("miser")) {
            budget = budget-gift.price;
            happiness = budget;
        }
        if (type.equals("generous")) {
            budget = budget-gift.price;
            happiness = happiness + girl.happiness;
        }
        if (type.equals("geeks")) {
            budget = budget-gift.price;
            happiness = happiness + girl.intelligence;
        }
    }
}
