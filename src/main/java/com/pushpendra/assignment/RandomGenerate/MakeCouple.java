package com.pushpendra.assignment.RandomGenerate;

import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Girl.CommittedGirl;
import com.pushpendra.assignment.exceptions.NoBoyFound;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by panther on 20/3/17.
 */
public class MakeCouple {
    /**
     *
     * @param c
     * @param b
     * @param g
     * @return
     */
    public int makecouple1 (Couple c[], CommittedBoys b[], CommittedGirl g[]) {
        int k, l,p1=0;
        for (k = 0; k < 200; k++) {
            for (l = 0; l < 500; l++) {
                if (g[k].maintenanceCost < b[l].budget && g[k].attractiveness > b[l].min_attr_req && g[k].status.equals("Single") && b[l].status.equals("Single")) {
                    b[l].girlfriend = g[k];
                    g[k].boyfriend = b[l];
                    b[l].girlfriend.status = "Committed";
                    g[k].boyfriend.status = "Committed";
                    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                    Date dateobj = new Date();
                    com.pushpendra.assignment.RandomGenerate.Log.info(df.format(dateobj) + " " + g[k].name + " and " + g[k].boyfriend.name + " got committed");
                    break;
                }
            }
            if(g[k].boyfriend==null){
                try {
                        throw new NoBoyFound(g[k]);
                    }catch (NoBoyFound noBoyFound) {
                        p1++;
                        if(k<199) {
                            System.out.println("moving on to girl " + g[k+1].name);
                        }
                        else
                            System.out.println("GIRL ARRAY SCANNED");
                    System.out.println();
                    }
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
        System.out.println("No Boy Found Exception was Catched " + p1 + " times\n");

        return cn;
    }

    /**
     *
     * @param gi
     */




}

