package com.pushpendra.assignment.RandomGenerate;

import com.pushpendra.assignment.Gifts.Gift;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by panther on 28/3/17.
 */
public class GetGifts {
    /**
     *
     * @param gi
     */
    public void getgifts(Gift gi[]){
        String csvFile1 = "csvFiles/GIFTS.csv";
        String line1 = "";
        String csvSplit1 = ",";
        BufferedReader buff1 = null;

        int j=0;
        try {
            buff1 = new BufferedReader(new FileReader(csvFile1));
            while ((line1 = buff1.readLine()) != null) {
                String[] gift = line1.split(csvSplit1);
                if (gift[0].equals("Essential")){
                    gi[j] = new Gift(gift[0],gift[1],100.00,100.00);
                }
                else if(gift[0].equals("Luxury")){
                    gi[j] = new Gift(gift[0],gift[1],100.00,100.00,10.00,10.00);
                }
                else{
                    gi[j] = new Gift(gift[0],gift[1],100.00,100.00,100.00,gift[2]);
                }
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
