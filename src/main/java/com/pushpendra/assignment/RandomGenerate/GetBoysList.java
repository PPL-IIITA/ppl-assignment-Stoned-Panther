package com.pushpendra.assignment.RandomGenerate;

import com.pushpendra.assignment.Boy.CommittedBoys;
import com.pushpendra.assignment.Girl.CommittedGirl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 * Created by panther on 29/3/17.
 */
public class GetBoysList {
    /**
     *
     * @param boys
     * @param b
     * @param n
     */
    public GetBoysList(String boys[],CommittedBoys b[],int n) {
        Random r = new Random();
        int i = 0;
        for(i = 0; i < n; i++){
            boys[i] = b[r.nextInt(499)].name;
        }
    }
}
