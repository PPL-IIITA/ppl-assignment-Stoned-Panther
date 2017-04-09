package com.pushpendra.assignment.SortingBoys;

import com.pushpendra.assignment.Boy.CommittedBoys;

/**
 * Created by panther on 28/3/17.
 */
public class SortSearch {
    /**
     *
     * @param b
     * @param boys
     * @param girls
     * @param n
     */
    public void Search(CommittedBoys b[],String boys[],String girls[],int n) {
        int i,j;
        for(i = 0; i < n; i++){
            for(j = 0; j < 500; j++){
                if(boys[i].equals(b[j].name))
                    girls[i] = b[j].girlfriend.name;
            }
        }
    }
}
