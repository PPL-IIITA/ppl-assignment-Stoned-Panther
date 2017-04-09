package com.pushpendra.assignment;

import com.pushpendra.assignment.RandomGenerate.NinthStructure;

import java.util.Scanner;

/**
 * Created by panther on 9/4/17.
 */
public class Ninth {
    public static void main(String[] args) {
        System.out.println("enter value of k < 20");
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        NinthStructure i = new NinthStructure();
        i.returnBoysGirlsGifts(k);
    }
}
