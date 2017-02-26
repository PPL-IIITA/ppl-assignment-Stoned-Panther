package com.pushpendra.model;

import java.util.Random;

/**
 * Created by panther on 24/2/17.
 */
public class CommittedGirl {
    //attributes of girl;
    public String status;
    public String type;
    public String name;
    public Double attractivness;
    public Double intelligence;
    public Double maintenanceCost;
    public CommittedBoy boyfriend;
    public Double happiness;

    Random r = new Random();

    /**
     *
     * @param status
     * @param type
     * @param name
     * @param attractivness
     * @param intelligence
     * @param maintenanceCost
     * @param boyfriend
     * @param happiness
     */
    public CommittedGirl(String status, String type, String name, Double attractivness, Double intelligence, Double maintenanceCost, CommittedBoy boyfriend, Double happiness) {
        this.status = status;
        this.type = type;
        this.name = name;
        this.attractivness = attractivness * r.nextDouble();
        this.intelligence = intelligence * r.nextDouble();
        this.maintenanceCost = maintenanceCost * r.nextDouble();
        this.boyfriend = boyfriend;
        this.happiness = happiness * r.nextDouble();
    }

    /**
     *
     * @param gift
     */
    public void countHappiness(Gift gift) {
        if (type.equals("choosy")) {
            if (gift.type.equals("Essential") || gift.type.equals("Utility")) {
                maintenanceCost  = maintenanceCost-gift.price;
                happiness = happiness + Math.log(gift.price);
            }
            if (gift.type.equals("Luxury")) {
                maintenanceCost  = maintenanceCost-gift.price;
                happiness = happiness + Math.log(2 * (gift.price));
            }
        }
        if (type.equals("normal")) {
            maintenanceCost  = maintenanceCost-gift.price;
            happiness = happiness + gift.price + gift.value;
        }
        if (type.equals("desperate")) {
            maintenanceCost  = maintenanceCost-gift.price;
            happiness = happiness + Math.exp(gift.price);
        }

    }
}
