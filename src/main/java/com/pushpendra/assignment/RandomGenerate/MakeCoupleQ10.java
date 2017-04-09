package com.pushpendra.assignment.RandomGenerate;

import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Gifts.Gift;
import com.pushpendra.assignment.Girl.CommittedGirl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by panther on 9/4/17.
 */
public class MakeCoupleQ10 {
    RandomK r = new RandomK();

    /**
     *
     * @param c
     * @param b
     * @param g
     * @param gi
     * @param n
     * @return
     */
    public int makecouple1(Couple c[], CommittedBoys b[], CommittedGirl g[],Gift gi[], int n) {
        int k, lm;

        for (k = 0; k < 200; k++) {
            CommittedBoys cb = r.randomBoy(b,n);
            if (g[k].maintenanceCost < cb.budget && g[k].intelligence < cb.intelligence && g[k].status.equals("Single") && cb.status.equals("Single")) {
                cb.girlfriend = g[k];
                g[k].boyfriend = cb;
                cb.girlfriend.status = "Committed";
                g[k].boyfriend.status = "Committed";
                DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                Date dateobj = new Date();
                Log.info(df.format(dateobj) + " " + g[k].name  + " and " + g[k].boyfriend.name + " got committed");
            }
        }

            for (lm = 0; lm < 500; lm++) {
                CommittedGirl gl = r.randomGirl(g,n);
                if (gl.maintenanceCost < b[lm].budget && gl.intelligence < b[lm].intelligence && gl.status.equals("Single") && b[lm].status.equals("Single")) {
                    b[lm].girlfriend = gl;
                    gl.boyfriend = b[lm];
                    b[lm].girlfriend.status = "Committed";
                    gl.boyfriend.status = "Committed";
                    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                    Date dateobj = new Date();
                    Log.info(df.format(dateobj) + " " + gl.name  + " and " + gl.boyfriend.name + " got committed");
                }
            }
        int cn = 0;
        for(int p = 0;p<200;p++){
            if(g[p].boyfriend!=null) {
                c[cn] = new Couple(g[p]);
                c[cn].countHappiness();
                c[cn].countCompability();
                cn++;
            }
        }
        for(int i = 0; i < cn; i++){
            Gift gg = r.randomGift(gi,n);
            int r=0;
            double l = c[i].boy.budget,p = 0.00,v = 0.00,t= 0.00;
            double giftPrice;
            if(c[i].boy.type.equals("miser")) {
                while (p <= c[i].girl.maintenanceCost && l >= gg.price) {
                    p = p + gg.price;
                    if (gg.type.equals("Luxury"))
                        t = t + gg.price;
                    l = l - gg.price;
                    v = v + gg.value;
                    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                    Date dateobj = new Date();
                    Log.info(df.format(dateobj) + " " + c[i].boy.name + "(" + c[i].boy.type + ")" + " gave " + gg.name + "(" + gg.type + " " + gg.price + " " + gg.value + ")" + " to " + c[i].girl.name + "(" + c[i].girl.type + ")");
                    RandomK rr  = new RandomK();
                    gg = rr.randomGift(gi,n);
                }
            }
                if(c[i].boy.type.equals("generous")) {
                    while(l >= gg.price ) {
                        p = p + gg.price;
                        if(gg.type.equals("Luxury"))
                            t = t + gg.price;
                        l = l - gg.price;
                        v = v + gg.value;
                        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                        Date dateobj = new Date();
                        Log.info(df.format(dateobj) + " " + c[i].boy.name + "(" + c[i].boy.type + ")" + " gave " + gg.name + "(" + gg.type + " " + gg.price + " " + gg.value + ")" + " to " + c[i].girl.name + "(" + c[i].girl.type + ")");
                        RandomK rr  = new RandomK();
                        gg = rr.randomGift(gi,n);
                    }
                }
                if(c[i].boy.type.equals("geeks")) {
                    while(p <= c[i].girl.maintenanceCost && l >= gg.price ) {
                        p = p + gg.price;
                        if(gg.type.equals("Luxury"))
                            t = t + gg.price;
                        l = l - gg.price;
                        v = v + gg.value;
                        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                        Date dateobj = new Date();
                        Log.info(df.format(dateobj) + " " + c[i].boy.name + "(" + c[i].boy.type + ")" + " gave " + gg.name + "(" + gg.type + " " + gg.price + " " + gg.value + ")" + " to " + c[i].girl.name + "(" + c[i].girl.type + ")");
                        RandomK rr  = new RandomK();
                        gg = rr.randomGift(gi,n);
                    }
                    if(gg.type.equals("Luxury") && l >= gg.price){
                            p = p + gg.price;
                            if(gg.type.equals("Luxury"))
                                t = t + gg.price;
                            l = l - gg.price;
                            v = v + gg.value;
                            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                            Date dateobj = new Date();
                        Log.info(df.format(dateobj) + " " + c[i].boy.name + "(" + c[i].boy.type + ")" + " gave " + gg.name + "(" + gg.type + " " + gg.price + " " + gg.value + ")" + " to " + c[i].girl.name + "(" + c[i].girl.type + ")");
                        break;
                    }
                }
            }
        return cn;
    }
}
