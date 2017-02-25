package com.pushpendra;

import com.pushpendra.model.CommittedBoy;
import com.pushpendra.model.CommittedGirl;
import util.MakeCouple;
import util.Util;

public class Main {

    public static void main(String[] args) {
        Util u = new Util();
        u.generateboys(100);
        u.generategirls(100);
        CommittedGirl[] g = new CommittedGirl[1000];
        CommittedBoy[] b = new CommittedBoy[1000];
        MakeCouple M = new MakeCouple();
        M.makecouple1(b, g);

        for (int k = 0; k < 50; k++) {
            if (g[k].status.equals("Committed")) {
                System.out.println(g[k].name + " is committed with " + g[k].boyfriend + " " + b[k].status);
            }
        }

    }
}
