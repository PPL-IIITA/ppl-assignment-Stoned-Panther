package com.pushpendra.model;

import java.util.Random;

/**
 * Created by panther on 24/2/17.
 */
public class CommittedGirl {
    //attributes of girl;
    public String status;
    String type;
    public String name;
    public Double attractivness;
    public Double intelligence;
    public Double maintenanceCost;
    public String boyfriend;
    public Double happiness;

    Random r = new Random();

    public CommittedGirl(String status, String type, String name, Double attractivness, Double intelligence, Double maintenanceCost, String boyfriend, Double happiness) {
        this.status = status;
        this.type = type;
        this.name = name;
        this.attractivness = attractivness * r.nextDouble();
        this.intelligence = intelligence * r.nextDouble();
        this.maintenanceCost = maintenanceCost * r.nextDouble();
        this.boyfriend = boyfriend;
        this.happiness = happiness * r.nextDouble();
    }

    void countHappiness(Gift gift) {
        if (type == "choosy") {
            if (gift.type == 'E' || gift.type == 'U') {
                happiness = happiness + Math.log(gift.price);
            }
            if (gift.type == 'L') {
                happiness = happiness + Math.log(2 * (gift.price));
            }
        }
        if (type == "normal") {
            happiness = happiness + gift.price + gift.value;
        }
        if (type == "desperate") {
            happiness = happiness + Math.exp(gift.price);
        }

    }
}
