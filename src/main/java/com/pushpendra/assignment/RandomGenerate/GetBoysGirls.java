package com.pushpendra.assignment.RandomGenerate;

import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Girl.CommittedGirl;

import java.io.*;

/**
 * Created by panther on 28/3/17.
 */
public class GetBoysGirls {
    /**
     *
     * @param b
     * @param g
     */
    public GetBoysGirls(CommittedBoys b[],CommittedGirl g[]) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("csvFiles/BOYS.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writer.print("");
        writer.close();

        PrintWriter writer1 = null;
        try {
            writer1 = new PrintWriter("csvFiles/GIRLS.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writer1.print("");
        writer1.close();

        PrintWriter writer2 = null;
        try {
            writer2 = new PrintWriter("csvFiles/GIFTS.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writer2.print("");
        writer2.close();
        PrintWriter writer3 = null;
        try {
            writer3 = new PrintWriter("csvFiles/Logging.log");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writer3.print("");
        writer3.close();
        Util u = new Util();
        u.generateboys(500);
        u.generategirls(200);
        u.generateGifts(3000);
        int i = 0;
        int j = 0;
        String csvFile = "csvFiles/BOYS.csv";
        String line = "";
        String csvSplit = ",";
        BufferedReader buff = null;
        try {
            buff = new BufferedReader(new FileReader(csvFile));
            while ((line = buff.readLine()) != null) {
                String[] boy = line.split(csvSplit);
                //	System.out.println(boy[0] + boy[1] + boy[2] + boy [3]);
                b[i] = new CommittedBoys(boy[2], 10.00,10.00,500.00,boy[0], boy[1], 10.00, 0.00,null);
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        String csvFile1 = "csvFiles/GIRLS.csv";
        String line1 = "";
        String csvSplit1 = ",";
        BufferedReader buff1 = null;


        try {
            buff1 = new BufferedReader(new FileReader(csvFile1));
            while ((line1 = buff1.readLine()) != null) {
                String[] girl = line1.split(csvSplit1);
                g[j] = new CommittedGirl(girl[2],10.00,10.00,200.00, girl[0], girl[1], null, 0.00);
                j++;
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (buff1 != null) {
                try {
                    buff1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
