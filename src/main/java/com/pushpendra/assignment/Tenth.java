package com.pushpendra.assignment;

import com.pushpendra.assignment.RandomGenerate.tenthStructure;

import java.util.Scanner;

/**
 * Created by panther on 9/4/17.
 */
public class Tenth {
    public static void main(String[] args) {
        System.out.println("enter value of n < 20");
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        tenthStructure i = new tenthStructure();
        i.returnBoysGirlsGifts(k);
    }
}
