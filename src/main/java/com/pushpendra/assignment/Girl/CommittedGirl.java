package com.pushpendra.assignment.Girl;

import com.pushpendra.assignment.Boy.CommittedBoys;

import java.util.Random;

/**
 * Created by panther on 23/2/17.
 */
public class CommittedGirl extends Girl {
    //attributes of girl;
    public String status;
    public String type;
    public CommittedBoys boyfriend;
    public Double happiness;

    Random r = new Random();

    /**
     *
     * @param name
     * @param attractiveness
     * @param intelligence
     * @param maintenanceCost
     * @param status
     * @param type
     * @param boyfriend
     * @param happiness
     */
    public CommittedGirl(String name, double attractiveness, double intelligence, double maintenanceCost, String status, String type, CommittedBoys boyfriend, Double happiness) {
        super(name, attractiveness, intelligence, maintenanceCost);
        this.status = status;
        this.type = type;
        this.boyfriend = boyfriend;
        this.happiness = happiness *r.nextDouble();
    }

    /**
     *
     * @param p
     * @param v
     * @param t
     */
    public void countHappiness(double p,double v,double t) {
        if (type.equals("choosy")) {
            happiness = Math.log(p + t);
        }
        if (type.equals("normal")) {
            happiness = p + v;
        }
        if (type.equals("desperate")) {
            happiness = Math.exp(p);
        }

    }
}
