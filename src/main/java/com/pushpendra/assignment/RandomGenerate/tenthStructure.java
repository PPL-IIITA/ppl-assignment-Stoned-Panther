package com.pushpendra.assignment.RandomGenerate;

import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Gifts.Gift;
import com.pushpendra.assignment.Girl.CommittedGirl;

/**
 * Created by panther on 9/4/17.
 */
public class tenthStructure {
    /**
     *
     * @param k
     */
    public void returnBoysGirlsGifts(int k){
        Couple[] c = new Couple[200];
        CommittedGirl[] g = new CommittedGirl[200];
        CommittedBoys[] b = new CommittedBoys[500];
        Gift[] gi = new Gift[3000];
        Givegifts gr = new Givegifts();
        GetBoysGirls m = new GetBoysGirls(b,g);
        GetGifts mi = new GetGifts();
        mi.getgifts(gi);
        SortGirlmaintenance(g);
        SortBoysAttractiveness(b);
        SortGiftsValue(gi);
        MakeCoupleQ10 r = new MakeCoupleQ10();
        int cn = r.makecouple1(c,b,g,gi,k);
    }

    /**
     *
     * @param g
     */
    public void SortGirlmaintenance(CommittedGirl g[]){
        int i,j;
        for(i = 0; i < 199; i++){
            for(j = 0; j < 199-i;j++) {
                if (g[j].maintenanceCost < g[j + 1].maintenanceCost) {
                    CommittedGirl n = g[j];
                    g[j] = g[j + 1];
                    g[j + 1] = n;
                }
            }
        }
    }

    /**
     *
     * @param b
     */
    public void SortBoysAttractiveness(CommittedBoys b[]){
        int i,j;
        for(i = 0; i < 499; i++){
            for(j = 0; j < 499-i;j++) {
                if (b[j].attractiveness < b[j + 1].attractiveness) {
                    CommittedBoys n = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = n;
                }
            }
        }
    }

    /**
     *
     * @param g
     */
    public void SortGiftsValue(Gift g[]){
        int i,j;
        for(i = 0; i < 2999; i++){
            for(j = 0; j < 2998-i;j++) {
                if (g[j].value < g[j + 1].value) {
                    Gift n = g[j];
                    g[j] = g[j + 1];
                    g[j + 1] = n;
                }
            }
        }
    }
}
