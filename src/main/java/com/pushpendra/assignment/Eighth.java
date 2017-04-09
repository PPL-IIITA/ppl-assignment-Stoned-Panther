package com.pushpendra.assignment;

import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Gifts.Gift;
import com.pushpendra.assignment.Girl.CommittedGirl;
import com.pushpendra.assignment.RandomGenerate.*;

import java.util.Scanner;

/**
 * Created by panther on 9/4/17.
 */
public class Eighth {

    public static void main(String[] args) {
        int cn=0;
        Couple[] c = new Couple[200];
        CommittedGirl[] g = new CommittedGirl[200];
        CommittedBoys[] b = new CommittedBoys[500];
        Gift[] gi = new Gift[3000];
        GetBoysGirls m = new GetBoysGirls(b,g);
        MakeCouple mii = new MakeCouple();
        cn = mii.makecouple1(c,b,g);
        GetGifts mi = new GetGifts();
        mi.getgifts(gi);
        Givegifts r;
        System.out.println("Choose gifting strategy\n1.Normal\n2.Bucket\nenter anything else for default");
        Scanner s = new Scanner(System.in);
        int ch = s.nextInt();
        switch (ch){
            case 1:
                System.out.println("Normal");
                r = new GiveGift8();
                r.givegifts(b,g,gi,3000);
                break;
            case 2:
                System.out.println("Bucket");
                r = new GiveGiftBucket();
                r.givegifts(b,g,gi,3000);
                break;
            default:
                System.out.println("Default");
                r = new GiveGift8();
                r.givegifts(b,g,gi,3000);
                break;
        }
    }
}
