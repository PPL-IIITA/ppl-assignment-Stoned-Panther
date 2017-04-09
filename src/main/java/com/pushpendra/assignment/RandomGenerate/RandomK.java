package com.pushpendra.assignment.RandomGenerate;

import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Gifts.Gift;
import com.pushpendra.assignment.Girl.CommittedGirl;

import java.util.Random;

/**
 * Created by panther on 9/4/17.
 */
public class RandomK {

    int t;

    /**
     *
     * @param b
     * @param n
     * @return
     */
    public CommittedBoys randomBoy(CommittedBoys b[],int n){
        Random r = new Random();
        t = (r.nextInt(n));
        return b[t];
    }

    /**
     *
     * @param b
     * @param n
     * @return
     */
    public CommittedGirl randomGirl(CommittedGirl b[], int n){
        Random r = new Random();
        t = (r.nextInt(n));
        return b[t];
    }

    /**
     *
     * @param b
     * @param n
     * @return
     */
    public  Gift randomGift(Gift b[], int n){
        Random r = new Random();
        t = (r.nextInt(n));
        return b[t];
    }
}
