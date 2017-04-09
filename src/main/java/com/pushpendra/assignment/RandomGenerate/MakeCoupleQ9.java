package com.pushpendra.assignment.RandomGenerate;

import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Girl.CommittedGirl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by panther on 9/4/17.
 */
public class MakeCoupleQ9 {
    /**
     *
     * @param c
     * @param b
     * @param g
     * @param n
     * @return
     */
    public int makecouple1(Couple c[], CommittedBoys b[], CommittedGirl g[],int n) {
        int k, l;
        for (k = 0; k < 200; k++) {
            for (l = 0; l < n; l++) {
                if (g[k].maintenanceCost < b[l].budget && g[k].intelligence < b[l].intelligence && g[k].status.equals("Single") && b[l].status.equals("Single")) {
                    b[l].girlfriend = g[k];
                    g[k].boyfriend = b[l];
                    b[l].girlfriend.status = "Committed";
                    g[k].boyfriend.status = "Committed";
                    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                    Date dateobj = new Date();
                    com.pushpendra.assignment.RandomGenerate.Log.info(df.format(dateobj) + " " + g[k].name  + " and " + g[k].boyfriend.name + " got committed");
                    break;
                }
            }
        }
        for (k = 0; k < n; k++) {
            for (l = 0; l < 500; l++) {
                if (g[k].maintenanceCost < b[l].budget && g[k].intelligence < b[l].intelligence && g[k].status.equals("Single") && b[l].status.equals("Single")) {
                    b[l].girlfriend = g[k];
                    g[k].boyfriend = b[l];
                    b[l].girlfriend.status = "Committed";
                    g[k].boyfriend.status = "Committed";
                    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                    Date dateobj = new Date();
                    com.pushpendra.assignment.RandomGenerate.Log.info(df.format(dateobj) + " " + g[k].name  + " and " + g[k].boyfriend.name + " got committed");
                    break;
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
        return cn;
    }
}
