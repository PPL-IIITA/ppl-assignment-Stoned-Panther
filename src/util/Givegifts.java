package util;

import com.pushpendra.model.CommittedBoy;
import com.pushpendra.model.CommittedGirl;
import com.pushpendra.model.Couple;
import com.pushpendra.model.Gift;

/**
 * Created by panther on 26/2/17.
 */
public class Givegifts {

    public void givegifts(Couple c[]) {
        Util u = new Util();
        u.generateboys(100);
        u.generategirls(100);
        u.generateGifts(200);
        CommittedGirl[] g = new CommittedGirl[1000];
        CommittedBoy[] b = new CommittedBoy[1000];
        MakeCouple M = new MakeCouple();
        M.makecouple1(b, g);
        Gift[] gi = new Gift[1000];
        M.getgifts(gi);
        int k;
        for(k = 0; k < 50; k++){
            for (int r =0;r<200;r++){
                if(b[k].budget >= gi[r].price){
                    b[k].girlfriend.countHappiness(gi[r]);
                    b[k].countHappiness(b[k].girlfriend,gi[r]);
                    break;
                }
            }
        }

        for(int p = 0;p<50;p++){
            c[p] = new Couple(b[p]);
            c[p].countHappiness();
            c[p].countCompability();
        }

    }
}
