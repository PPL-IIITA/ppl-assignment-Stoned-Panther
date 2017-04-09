package com.pushpendra.assignment;

import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Gifts.Gift;
import com.pushpendra.assignment.Girl.CommittedGirl;
import com.pushpendra.assignment.RandomGenerate.*;

import java.util.Scanner;

/**
 * Created by panther on 27/3/17.
 */
public class Fourth {

    public static void main(String[] args) {
        System.out.println("enter value of k < 20");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int cn=0;
        Couple[] c = new Couple[3000];
        CommittedGirl[] g = new CommittedGirl[3000];
        CommittedBoys[] b = new CommittedBoys[3000];
        Gift[] gi = new Gift[3000];
        Givegifts gr = new Givegifts();
        GetBoysGirls m = new GetBoysGirls(b,g);
        GetGifts mi = new GetGifts();
        mi.getgifts(gi);
        MakeCouple mii = new MakeCouple();
        cn = mii.makecouple1(c,b,g);
        int i = 0;
        gr.givegifts(b,g,gi,3000);
        for(i = 0; i < cn; i++) {
            c[i].countHappiness();
        }
        DoBreakUp d = new DoBreakUp();
        cn = d.BreakUp(c,b,g,gi,cn,k);
    }
}
