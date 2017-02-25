package util;

import com.pushpendra.model.CommittedBoy;
import com.pushpendra.model.CommittedGirl;

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

    public void makecouple1(CommittedBoy b[], CommittedGirl g[]) {
        try {
            buff = new BufferedReader(new FileReader(csvFile));
            while ((line = buff.readLine()) != null) {
                String[] boy = line.split(csvSplit);
                //	System.out.println(boy[0] + boy[1] + boy[2] + boy [3]);
                b[i] = new CommittedBoy(boy[0], boy[1], boy[2], 10.00, 10.00, 2000.00, 10.00, 0.00, "");
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
                g[j] = new CommittedGirl(girl[0], girl[1], girl[2], 10.00, 10.00, 1000.00, "", 0.00);
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
                    b[l].girlfriend = g[k].name;
                    g[k].boyfriend = b[l].name;
                    b[l].status = "Committed";
                    g[k].status = "Committed";
                    break;
                }
            }
        }
    }

}

