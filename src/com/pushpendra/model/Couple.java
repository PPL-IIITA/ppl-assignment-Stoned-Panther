package com.pushpendra.model;

/**
 * Created by panther on 26/2/17.
 */
public class Couple {
    public CommittedBoy boy;
    public double happiness,compatibility;

    public Couple(CommittedBoy boy) {
        this.boy = boy;
    }

    public void countHappiness(){
        happiness = boy.happiness+boy.girlfriend.happiness;
    }
    public void countCompability(){
        compatibility = Math.abs(boy.budget-boy.girlfriend.maintenanceCost) + Math.abs(boy.attractivness-boy.girlfriend.attractivness)+Math.abs(boy.intelligence-boy.girlfriend.attractivness);
    }
}
