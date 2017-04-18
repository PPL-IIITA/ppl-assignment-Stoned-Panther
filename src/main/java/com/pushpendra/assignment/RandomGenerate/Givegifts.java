package com.pushpendra.assignment.RandomGenerate;

import com.pushpendra.assignment.Girl.CommittedGirl;
import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Gifts.Gift;
import com.pushpendra.assignment.exceptions.NoMoreGiftsAvailable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by panther on 20/3/17.
 */
public class Givegifts {
    /**
     *
     * @param b
     * @param g
     * @param gi
     * @param s
     */
    public void givegifts(CommittedBoys b[],CommittedGirl g[],Gift gi[],int s) {
        int k,os=0;
        for(k = 0; k < 200; k++){
            if(g[k].boyfriend!=null){
                int r=0;
                double l = g[k].boyfriend.budget,p = 0.00,v = 0.00,t= 0.00;
                double giftPrice;
                if(g[k].boyfriend.type.equals("miser")) {
                    while(p <= g[k].maintenanceCost &&  l >= gi[r].price && r < s) {
                        p = p + gi[r].price;
                        if(gi[r].type.equals("Luxury"))
                            t = t + gi[r].price;
                        l = l - gi[r].price;
                        v = v + gi[r].value;
                        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                        Date dateobj = new Date();
                        com.pushpendra.assignment.RandomGenerate.Log.info(df.format(dateobj) + " " + g[k].boyfriend.name + "(" + g[k].boyfriend.type +")" + " gave " + gi[r].name + "(" + gi[r].type +  " " + gi[r].price + " " + gi[r].value + ")"+ " to " +g[k].name + "(" + g[k].type + ")");
                        r++;
                    }
                }
                if(g[k].boyfriend.type.equals("generous")) {
                    while(l >= gi[r].price && r<s) {
                        p = p + gi[r].price;
                        if(gi[r].type.equals("Luxury"))
                            t = t + gi[r].price;
                        l = l - gi[r].price;
                        v = v + gi[r].value;
                        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                        Date dateobj = new Date();
                        com.pushpendra.assignment.RandomGenerate.Log.info(df.format(dateobj) + " " + g[k].boyfriend.name + "(" + g[k].boyfriend.type +")" + " gave " + gi[r].name + "(" + gi[r].type +  " " + gi[r].price + " " + gi[r].value +  ")"+ " to " +g[k].name + "(" + g[k].type + ")");
                        r++;
                    }
                }
                if(g[k].boyfriend.type.equals("geeks")) {
                    while(p <= g[k].maintenanceCost && l >= gi[r].price && r < s) {
                        p = p + gi[r].price;
                        if(gi[r].type.equals("Luxury"))
                            t = t + gi[r].price;
                        l = l - gi[r].price;
                        v = v + gi[r].value;
                        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                        Date dateobj = new Date();
                        com.pushpendra.assignment.RandomGenerate.Log.info(df.format(dateobj) + " " + g[k].boyfriend.name + "(" + g[k].boyfriend.type +")" + " gave " + gi[r].name + "(" + gi[r].type +  " " + gi[r].price + " " + gi[r].value +  ")"+ " to " +g[k].name + "(" + g[k].type + ")");
                        r++;
                    }
                    while(r<s){
                        if(gi[r].type.equals("Luxury") && l >= gi[r].price){
                            p = p + gi[r].price;
                            if(gi[r].type.equals("Luxury"))
                                t = t + gi[r].price;
                            l = l - gi[r].price;
                            v = v + gi[r].value;
                            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                            Date dateobj = new Date();
                            com.pushpendra.assignment.RandomGenerate.Log.info(df.format(dateobj) + " " + g[k].boyfriend.name + "(" + g[k].boyfriend.type +")" + " gave " + gi[r].name + "(" + gi[r].type +  " " + gi[r].price + " " + gi[r].value +  ")"+ " to " +g[k].name + "(" + g[k].type + ")");
                            break;
                        }
                        r++;
                    }
                }
                if(r==s-1){
                    try{
                        throw new NoMoreGiftsAvailable();
                    } catch (NoMoreGiftsAvailable noMoreGiftsAvailable) {
                        os++;
                        noMoreGiftsAvailable.printStackTrace();
                    }
                }
                //System.out.println(p + " " + v  + " " + t);
                g[k].countHappiness(p,v,t);
               // System.out.println(g[k].type + " " + g[k].happiness);
                g[k].boyfriend.countHappiness(l,g[k]);
                //System.out.println(g[k].boyfriend.happiness);
            }
        }
        System.out.println("NoMoreGiftsAvailable Exception was catched " + os + " times\n");
    }
}


