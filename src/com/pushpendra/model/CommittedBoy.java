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

    public void countHappiness(CommittedGirl girl, Gift gift) {
        if (type == "miser") {
            happiness = happiness + budget - gift.price;
        }
        if (type == "generous") {
            happiness = happiness + girl.happiness;
        }
        if (type == "geeks") {
            happiness = happiness + girl.intelligence;
        }
    }
}
