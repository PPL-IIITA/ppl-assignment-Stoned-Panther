package util;

import com.pushpendra.model.CommittedBoy;
import com.pushpendra.model.CommittedGirl;
import com.pushpendra.model.Couple;
import com.pushpendra.model.Gift;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by panther on 26/2/17.
 */
public class Givegifts {
    /**
     *
     * @param c
     */
    public void givegifts(Couple c[]) {
        Util u = new Util();
        u.generateboys(1000);
        u.generategirls(1000);
        u.generateGifts(1000);
        CommittedGirl[] g = new CommittedGirl[3000];
        CommittedBoy[] b = new CommittedBoy[3000];
        MakeCouple M = new MakeCouple();
        M.makecouple1(b, g);
        Gift[] gi = new Gift[3000];
        M.getgifts(gi);
        int k;
        for(k = 0; k < 100; k++){
            if(g[k].boyfriend!=null){
                int r=0;
                if(g[k].boyfriend.type.equals("miser")) {
                    while(g[k].maintenanceCost >= 0) {
                        g[k].countHappiness(gi[r]);
                        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                        Date dateobj = new Date();
                        Log.info(df.format(dateobj) + " " + g[k].boyfriend.name + "(" + g[k].boyfriend.type +")" + " gave " + gi[r].name + "(" + gi[r].type + ")"+ " to " +g[k].name + "(" + g[k].type + ")");
                        r++;
                    }
                }
                if(g[k].boyfriend.type.equals("generous")) {
                    while(g[k].boyfriend.budget >= gi[r].price) {
                        g[k].boyfriend.budget-=gi[r].price;
                        g[k].countHappiness(gi[r]);
                        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                        Date dateobj = new Date();
                        Log.info(df.format(dateobj) + " " + g[k].boyfriend.name + "(" + g[k].boyfriend.type +")" + " gave " + gi[r].name + "(" + gi[r].type + ")"+ " to " +g[k].name + "(" + g[k].type + ")");
                        r++;
                    }
                }
                if(g[k].boyfriend.type.equals("geeks")) {
                    while(g[k].maintenanceCost >= 0) {
                        g[k].countHappiness(gi[r]);
                        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                        Date dateobj = new Date();
                        Log.info(df.format(dateobj) + " " + g[k].boyfriend.name + "(" + g[k].boyfriend.type +")" + " gave " + gi[r].name + "(" + gi[r].type + ")"+ " to " +g[k].name + "(" + g[k].type + ")");
                        r++;
                    }
                    while(r<200){
                        if(gi[r].type.equals("Luxury") && g[k].boyfriend.budget >= gi[r].price){
                            g[k].boyfriend.budget-=gi[r].price;
                            g[k].countHappiness(gi[r]);
                            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                            Date dateobj = new Date();
                            Log.info(df.format(dateobj) + " " + g[k].boyfriend.name + "(" + g[k].boyfriend.type +")" + " gave " + gi[r].name + "(" + gi[r].type + ")"+ " to " +g[k].name + "(" + g[k].type + ")");
                            break;
                        }
                        r++;
                    }
                }
                g[k].boyfriend.countHappiness(g[k],gi[r]);
            }

        }
        int r =0;
        for(int p = 0;p<1000;p++){
            if(g[p].boyfriend!=null) {
                c[r] = new Couple(g[p]);
                c[r].countHappiness();
                c[r].countCompability();
                r++;
            }
        }

    }
}
