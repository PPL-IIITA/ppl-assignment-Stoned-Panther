package com.pushpendra.model;

/**
 * Created by panther on 26/2/17.
 */
public class Couple {
    public CommittedGirl girl;
    public double happiness,compatibility;

    /**
     *
     * @param girl
     */
    public Couple(CommittedGirl girl) {
        this.girl = girl;
    }

    /**
     *
     */
    public void countHappiness(){
        happiness = girl.happiness+girl.boyfriend.happiness;
    }

    /**
     *
     */
    public void countCompability(){
        compatibility = Math.abs(girl.boyfriend.budget-girl.maintenanceCost) + Math.abs(girl.boyfriend.attractivness-girl.attractivness)+Math.abs(girl.boyfriend.intelligence-girl.attractivness);
    }
}
