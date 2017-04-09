package com.pushpendra.assignment.Boy;

import com.pushpendra.assignment.Girl.CommittedGirl;

import java.util.Random;

/**
 * Created by panther on 23/2/17.
 */
public class CommittedBoys extends Boy {
    //attributes of boy
    public String status, type;
    public double min_attr_req;
    public double happiness = 0.00;
    public CommittedGirl girlfriend;
    Random r = new Random();

    /**
     *
     * @param name
     * @param attractiveness
     * @param intelligence
     * @param budget
     * @param status
     * @param type
     * @param min_attr_req
     * @param happiness
     * @param girlfriend
     */
    public CommittedBoys(String name, double attractiveness, double intelligence, double budget, String status, String type, double min_attr_req, double happiness, CommittedGirl girlfriend) {
        super(name, attractiveness, intelligence, budget);
        this.status = status;
        this.type = type;
        this.min_attr_req = min_attr_req * r.nextDouble();
        this.happiness = happiness * r.nextDouble();
        this.girlfriend = girlfriend;
    }

    /**
     *
     * @param l
     * @param girl
     */
    public void countHappiness(double l,CommittedGirl girl) {
        if (type.equals("miser")) {
            happiness = l;
        }
        if (type.equals("generous")) {
            happiness = girl.happiness;
        }
        if (type.equals("geeks")) {
            happiness = girl.intelligence;
        }
    }
}
