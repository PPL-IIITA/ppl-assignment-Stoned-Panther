package com.pushpendra.assignment.RandomGenerate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by panther on 29/3/17.
 */
public class GetBoysList {
    /**
     *
     * @param boys
     * @param n
     */
    public GetBoysList(String boys[],int n) {
        int i = 0;
        String csvFile = "csvFiles/BOYS.csv";
        String line = "";
        String csvSplit = ",";
        BufferedReader buff = null;
        try {
            buff = new BufferedReader(new FileReader(csvFile));
            while ((line = buff.readLine()) != null && i < n ) {
                String[] boy = line.split(csvSplit);
                boys[i]  = boy[2];
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
