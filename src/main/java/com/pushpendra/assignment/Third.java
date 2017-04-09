package com.pushpendra.assignment;

import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Gifts.Gift;
import com.pushpendra.assignment.Girl.CommittedGirl;
import com.pushpendra.assignment.RandomGenerate.*;

import java.util.Scanner;

/**
 * Created by panther on 20/3/17.
 */
public class Third {
    public static void main(String[] args) {
        System.out.println("enter value of k < 20");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
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
        int i,j;
        for(i = 0; i < cn; i++){
            c[i].countHappiness();
            c[i].countCompability();
        }
        System.out.println(k + " happiest couple");
        for(i = 0; i < k; i++){
            for(j = 0; j < cn-1-i;j++){
                if(c[j].happiness > c[j+1].happiness){
                    Couple n = c[j];
                    c[j]=c[j+1];
                    c[j+1] = n;
                }
            }
            System.out.println(c[cn-1-i].girl.name + " " + c[cn-1-i].girl.boyfriend.name);
        }
        System.out.println(k +" Most Compatible couple");
        for(i = 0; i < k; i++){
            for(j = 0; j < cn-1-i;j++){
                if(c[j].compatibility > c[j+1].compatibility){
                    Couple n = c[j];
                    c[j]=c[j+1];
                    c[j+1] = n;
                }
            }
            System.out.println(c[cn-1-i].girl.name + " " + c[cn-1-i].girl.boyfriend.name);
        }
    }
}
