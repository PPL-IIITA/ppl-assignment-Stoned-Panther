package util;

import com.pushpendra.model.CommittedBoy;
import com.pushpendra.model.CommittedGirl;
import com.pushpendra.model.Gift;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by panther on 25/2/17.
 */
public class MakeCouple {
    int i = 0;
    int j = 0;
    String csvFile = "csvFiles/BOYS.csv";
    String line = "";
    String csvSplit = ",";
    BufferedReader buff = null;

    /**
     *
     * @param b
     * @param g
     */
    public void makecouple1(CommittedBoy b[], CommittedGirl g[]) {
        try {
            buff = new BufferedReader(new FileReader(csvFile));
            while ((line = buff.readLine()) != null) {
                String[] boy = line.split(csvSplit);
                //	System.out.println(boy[0] + boy[1] + boy[2] + boy [3]);
                b[i] = new CommittedBoy(boy[0], boy[1], boy[2], 10.00, 10.00, 2000.00, 10.00, 0.00, null);
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
                g[j] = new CommittedGirl(girl[0], girl[1], girl[2], 10.00, 10.00, 1000.00, null, 0.00);
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
        int k, l;
        for (k = 0; k < 50; k++) {
            for (l = 0; l < 50; l++) {
                if (g[k].maintenanceCost < b[l].budget && g[k].attractivness > b[l].min_attr_req && g[k].status.equals("Single") && b[l].status.equals("Single")) {
                    b[l].girlfriend = g[k];
                    g[k].boyfriend = b[l];
                    b[l].girlfriend.status = "Committed";
                    g[k].boyfriend.status = "Committed";
                    break;
                }
            }
        }
    }

    /**
     *
     * @param gi
     */
    public void getgifts(Gift gi[]){
        String csvFile1 = "csvFiles/GIFTS.csv";
        String line1 = "";
        String csvSplit1 = ",";
        BufferedReader buff1 = null;

        j=0;
        try {
            buff1 = new BufferedReader(new FileReader(csvFile1));
            while ((line1 = buff1.readLine()) != null) {
                String[] gift = line1.split(csvSplit1);
                if (gift[0].equals("Essential")){
                    gi[j] = new Gift(gift[0],gift[1],500.00,500.00);
                }
                else if(gift[0].equals("Luxury")){
                    gi[j] = new Gift(gift[0],gift[1],500.00,500.00,10.00,10.00);
                }
                else{
                    gi[j] = new Gift(gift[0],gift[1],500.00,500.00,100.00,gift[2]);
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

