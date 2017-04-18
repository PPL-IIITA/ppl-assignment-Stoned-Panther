package com.pushpendra.assignment.RandomGenerate;

import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Girl.CommittedGirl;
import com.pushpendra.assignment.exceptions.NoBoyFound;
import com.pushpendra.assignment.exceptions.NoGirlFound;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by panther on 28/3/17.
 */
public class MakeCoupleQ5 {

    /**
     *
     * @param c
     * @return
     */
    public int makeQ5couple(CommittedBoys b[],CommittedGirl g[],Couple c[]){
        GetBoysGirls go = new GetBoysGirls(b,g);
        int k, l;
        for(k = 0; k < 199; k++) {
            for (l = 0; l < 199 - k; l++) {
                if (g[l].maintenanceCost > g[l + 1].maintenanceCost) {
                    CommittedGirl o = g[l];
                    g[l] = g[l + 1];
                    g[l + 1] = o;
                }
            }
        }
        for(k = 0; k < 499; k++){
            for(l = 0; l < 499-k; l++){
                if(b[l].attractiveness > b[l+1].attractiveness){
                    CommittedBoys o = b[l];
                    b[l]=b[l+1];
                    b[l+1]=o;
                }
            }
        }
        k = 0;
        int p = 0,p1=0,p2=0;
        while(k<200 && p<500){
                if(g[k].status.equals("Single")) {
                    for (l = 0; l < 500; l++) {
                        if (g[k].maintenanceCost < b[l].budget && g[k].attractiveness > b[l].min_attr_req && b[l].status.equals("Single")) {
                            b[l].girlfriend = g[k];
                            g[k].boyfriend = b[l];
                            b[l].girlfriend.status = "Committed";
                            g[k].boyfriend.status = "Committed";
                            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                            Date dateobj = new Date();
                            com.pushpendra.assignment.RandomGenerate.Log.info(df.format(dateobj) + " " + g[k].name  + " and " + g[k].boyfriend.name + " got committed");
                            k++;
                            break;
                        }
                        if(l==499){
                            k++;
                            if(g[k].boyfriend==null){
                                try {
                                    throw new NoBoyFound(g[k]);
                                }catch (NoBoyFound noBoyFound) {
                                    p1++;
                                    if(p<499) {
                                        System.out.println("moving on to boy->" + b[p].name);
                                    }
                                    else
                                        System.out.println("BOY ARRAY SCANNED");
                                    System.out.println();
                                }
                            }
                        }

                    }
                }
                else
                    k++;
                if(b[p].status.equals("Single")) {
                    for (l = 0; l < 200; l++) {
                        if (g[l].maintenanceCost < b[p].budget && g[l].attractiveness > b[p].min_attr_req && g[l].status.equals("Single")) {
                            b[p].girlfriend = g[l];
                            g[l].boyfriend = b[p];
                            b[p].girlfriend.status = "Committed";
                            g[l].boyfriend.status = "Committed";
                            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                            Date dateobj = new Date();
                            com.pushpendra.assignment.RandomGenerate.Log.info(df.format(dateobj) + " " + b[p].name  + " and " + b[p].girlfriend.name + " got committed");
                            p++;
                            break;
                        }
                        if(l==199) {
                            p++;
                            if(b[p].girlfriend==null){
                                try {
                                    throw new NoGirlFound(b[p]);
                                }catch (NoGirlFound noGirlFound) {
                                    p2++;
                                    if(k<199) {
                                        System.out.println("moving on to girl->" + g[k].name);
                                    }
                                    else
                                        System.out.println("GIRL ARRAY SCANNED");
                                    System.out.println();
                                }
                            }
                        }
                    }
                }
                else
                    p++;
        }
        int cn = 0;
        for(p = 0;p<200;p++){
            if(g[p].boyfriend!=null) {
                c[cn] = new Couple(g[p]);
                c[cn].countHappiness();
                c[cn].countCompability();
                cn++;
            }
        }

        System.out.println("No Boy Found Exception was Catched " + p1 + " times");
        System.out.println("No Girl Found Exception was Catched " + p2 + " times\n");
        return cn;

    }

}
