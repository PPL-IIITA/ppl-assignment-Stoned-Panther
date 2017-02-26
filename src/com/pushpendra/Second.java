package com.pushpendra;

import com.pushpendra.model.Couple;
import util.Givegifts;

/**
 * Created by panther on 26/2/17.
 */
public class Second {
    public static void main(String[] args) {
        Couple[] c = new Couple[1000];
        Givegifts gr = new Givegifts();
        gr.givegifts(c);
        int i,j;
        System.out.println("10 happiest couple");
        for(i = 0; i < 10; i++){
            for(j = 0; j < 20-i;j++){
                if(c[j].happiness > c[j+1].happiness){
                    Couple n = c[j];
                    c[j]=c[j+1];
                    c[j+1] = n;
                }
            }
            System.out.println(c[20-i].girl.name + " " + c[20-i].girl.boyfriend.name);
        }
        System.out.println(" 10 Most Compatible couple");
        for(i = 0; i < 10; i++){
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
