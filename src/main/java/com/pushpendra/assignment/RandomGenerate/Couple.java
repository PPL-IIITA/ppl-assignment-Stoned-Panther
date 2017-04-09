package com.pushpendra.assignment.RandomGenerate;

import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Girl.CommittedGirl;

/**
 * Created by panther on 20/3/17.
 */
public class Couple {
    public CommittedGirl girl;
    public CommittedBoys boy;
    public double happiness,compatibility;

    /**
     *
     * @param girl
     */
    public Couple(CommittedGirl girl) {
        this.girl = girl;
        boy = girl.boyfriend;
    }

    /**
     *
     * @param boy
     */
    public Couple(CommittedBoys boy) {
        this.boy = boy;
        girl = boy.girlfriend;
    }

    /**
     *
     */
    public void countHappiness(){
        happiness = girl.happiness + girl.boyfriend.happiness;
    }

    /**
     *
     */
    public void countCompability(){
        compatibility = Math.abs(girl.boyfriend.budget-girl.maintenanceCost) + Math.abs(girl.boyfriend.attractiveness-girl.attractiveness)+Math.abs(girl.boyfriend.intelligence-girl.attractiveness);
    }
}
