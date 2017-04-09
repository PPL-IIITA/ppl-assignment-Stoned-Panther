package com.pushpendra.assignment;

import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Gifts.Gift;
import com.pushpendra.assignment.Girl.CommittedGirl;
import com.pushpendra.assignment.RandomGenerate.*;

import java.util.Scanner;

/**
 * Created by panther on 28/3/17.
 */
public class Sixth {

    public static void main(String[] args) {
        int i,j,t;
        System.out.println("enter value of t");
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int cn=0;
        Couple[] c = new Couple[200];
        CommittedGirl[] g = new CommittedGirl[200];
        CommittedBoys[] b = new CommittedBoys[500];
        Gift[] gi = new Gift[3000];
        Givegifts gr = new Givegifts();
        GetBoysGirls m = new GetBoysGirls(b,g);
        GetGifts mi = new GetGifts();
        mi.getgifts(gi);
        MakeCouple mii = new MakeCouple();
        cn = mii.makecouple1(c,b,g);
        gr.givegifts(b,g,gi,3000);
        for(i = 0; i < cn; i++) {
            c[i].countHappiness();
        }
        for(j = 0; j < t; j++){
            int r = j+1;
            System.out.println("DAY " + r);
            DoBreakUp d = new DoBreakUp();
            cn = d.BreakUp(c,b,g,gi,cn,t);
            gr.givegifts(b,g,gi,3000);
            for(i = 0; i < cn; i++) {
                c[i].countHappiness();
            }
        }

    }
}
