package com.pushpendra;

import com.pushpendra.model.Couple;
import util.Givegifts;

/**
 * Created by panther on 26/2/17.
 */
public class Second {
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("please enter value of k upto 15");
        }
        int k = Integer.parseInt(args[0]);

        Couple[] c = new Couple[1000];
        Givegifts gr = new Givegifts();
        gr.givegifts(c);
        int i,j;
        System.out.println(k+" happiest couple");
        for(i = 0; i < k; i++){
            for(j = 0; j < 20-i;j++){
                if(c[j].happiness > c[j+1].happiness){
                    Couple n = c[j];
                    c[j]=c[j+1];
                    c[j+1] = n;
                }
            }
            System.out.println(c[20-i].girl.name + " " + c[20-i].girl.boyfriend.name);
        }
        System.out.println(k+" Most Compatible couple");
        for(i = 0; i < k; i++){
            for(j = 0; j < 20-i;j++){
                if(c[j].compatibility > c[j+1].compatibility){
                    Couple n = c[j];
                    c[j]=c[j+1];
                    c[j+1] = n;
                }
            }
            System.out.println(c[20-i].girl.name + " " + c[20-i].girl.boyfriend.name);
        }
    }
}
