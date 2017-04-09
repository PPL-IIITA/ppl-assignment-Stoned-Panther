package com.pushpendra.assignment;

import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Girl.CommittedGirl;
import com.pushpendra.assignment.RandomGenerate.Couple;
import com.pushpendra.assignment.RandomGenerate.GetBoysGirls;
import com.pushpendra.assignment.RandomGenerate.GetBoysList;
import com.pushpendra.assignment.RandomGenerate.MakeCouple;
import com.pushpendra.assignment.SortingBoys.BinarySearch;
import com.pushpendra.assignment.SortingBoys.HashTable;
import com.pushpendra.assignment.SortingBoys.SortSearch;
import com.pushpendra.assignment.SortingBoys.linearSearch;

import java.util.Scanner;

/**
 * Created by panther on 28/3/17.
 */
public class Seventh {
    public static void main(String[] args) {
        int cn=0;
        System.out.println("enter no. of boys in list");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Couple[] c = new Couple[200];
        CommittedGirl[] g = new CommittedGirl[200];
        CommittedBoys[] b = new CommittedBoys[500];
        GetBoysGirls m = new GetBoysGirls(b,g);
        MakeCouple mii = new MakeCouple();
        cn = mii.makecouple1(c,b,g);
        String[] boys = new String[k];
        String[] girls = new String[k];
        GetBoysList gi = new GetBoysList(boys,k);
        int i;
        for(i = 0; i < k; i++)
            System.out.println(boys[i]);
        SortSearch si;
        System.out.println("Choose from\n1.linear search\n2.Binary search\n3.HashTable\nenter anything else for default implementation");
        Scanner s = new Scanner(System.in);
        int ch = s.nextInt();
        switch (ch){
            case 1:
                System.out.println("linear");
                si = new linearSearch();
                si.Search(b,boys,girls,k);
                break;
            case 2:
                System.out.println("Binary");
                si = new BinarySearch();
                si.Search(b,boys,girls,k);
                break;
            case 3:
                System.out.println("HashTable");
                si = new HashTable();
                si.Search(b,boys,girls,k);
                break;
            default:
                System.out.println("Default");
                si = new linearSearch();
                si.Search(b,boys,girls,k);
                break;
        }
        for(i = 0; i < k; i++)
            System.out.println(boys[i] + "'s girlfriend is " + girls[i]);
    }
}
