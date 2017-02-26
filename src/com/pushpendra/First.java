package com.pushpendra;

import com.pushpendra.model.CommittedBoy;
import com.pushpendra.model.CommittedGirl;
import com.pushpendra.model.Couple;
import util.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class First {

    public static void main(String[] args) {
        CommittedGirl[] g = new CommittedGirl[1000];
        GenerateInput gr = new GenerateInput(g);

        for (int k = 0; k < 50; k++) {
            if (g[k].status.equals("Committed")) {
                System.out.println(g[k].name + " is committed with " + g[k].boyfriend.name + " " + g[k].boyfriend.status);
                DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                Date dateobj = new Date();
                Log.info(df.format(dateobj) + " " + g[k].name + "(" + g[k].type +")" + " is committed to " + g[k].boyfriend.name + "(" + g[k].boyfriend.type + ")");
            }
        }



    }
}
