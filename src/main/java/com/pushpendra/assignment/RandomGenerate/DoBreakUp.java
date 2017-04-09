package com.pushpendra.assignment.RandomGenerate;

import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Gifts.Gift;
import com.pushpendra.assignment.Girl.CommittedGirl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by panther on 27/3/17.
 */
public class DoBreakUp {
    /**
     *
     * @param c
     * @param b
     * @param g
     * @param gi
     * @param cn
     * @param t
     * @return
     */
    public int BreakUp(Couple c[], CommittedBoys[] b, CommittedGirl[] g, Gift[] gi,int cn,int t){
        int i,j;
        for(i = 0; i < cn-1; i++){
            for(j = 0; j < cn-1-i;j++){
                if(c[j].happiness > c[j+1].happiness){
                    Couple n = c[j];
                    c[j]=c[j+1];
                    c[j+1] = n;
                }
            }
        }
        System.out.println(t+ " least happy couple");
        for(i = 0; i < t; i++)
            System.out.println(c[i].girl.name + " " + c[i].girl.boyfriend.name);

        System.out.println("Breaking up and Assigning new Boyfriends");
        for(i = 0; i < t; i++){
            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
            Date dateobj = new Date();
            com.pushpendra.assignment.RandomGenerate.Log.info(df.format(dateobj) + " " + c[i].girl.name  + " and " + c[i].girl.boyfriend.name + " broke up");

            for(j = 0; j < 500; j++){
                if (c[i].girl.maintenanceCost <= b[j].budget && c[i].girl.attractiveness >= b[j].min_attr_req  && b[j].status.equals("Single") ) {
                    c[i].girl.boyfriend.girlfriend = null;
                    c[i].girl.boyfriend.status = "Single";
                    c[i].girl.boyfriend.happiness = 0.00;
                    c[i].girl.boyfriend = null;
                    c[i].girl.happiness = 0.00;
                    c[i].girl.boyfriend = b[j];
                    b[j].girlfriend = c[i].girl;
                    c[i].girl.boyfriend.status = "Committed";
                    break;
                }
                if(j == 499){
                    c[i].girl.boyfriend.girlfriend = null;
                    c[i].girl.boyfriend.status = "Single";
                    c[i].girl.boyfriend.happiness = 0.00;
                    c[i].girl.boyfriend = null;
                    c[i].girl.happiness = 0.00;
                    c[i].girl.status = "Single";
                }
            }
        }
        for(i = 0; i < t; i++) {
            if(c[i].girl.boyfriend!=null) {
                System.out.println(c[i].girl.name + " " + c[i].girl.boyfriend.name);
                DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                Date dateobj = new Date();
                com.pushpendra.assignment.RandomGenerate.Log.info(df.format(dateobj) + " " + c[i].girl.name  + " and " + c[i].girl.boyfriend.name + " got committed ");
            }
            else
                System.out.println(c[i].girl.name + "  no boyfriend");
        }
        cn = 0;
        for(int p = 0;p<200;p++){
            if(g[p].boyfriend!=null) {
                c[cn] = new Couple(g[p]);
                c[cn].countHappiness();
                c[cn].countHappiness();
                cn++;
            }
        }
        return cn;
    }
}
