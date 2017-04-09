package com.pushpendra.assignment.SortingBoys;

import com.pushpendra.assignment.Boy.CommittedBoys;

/**
 * Created by panther on 28/3/17.
 */
public class BinarySearch extends SortSearch {
    /**
     *
     * @param b
     * @param boys
     * @param girls
     * @param n
     */
    @Override
    public void Search(CommittedBoys[] b, String[] boys, String[] girls, int n) {
        int i,j;
        for(i = 0; i < 499; i++){
            for(j = 0; j < 499-i ; j++){
                    if(b[j].name.compareTo(b[j+1].name)>0){
                    CommittedBoys bi = b[j];
                    b[j] = b[j+1];
                    b[j+1] = bi;
                 }
            }
        }
        for(i = 0; i < n; i++){
            search(b,0,499,boys,girls,i);
        }
    }

    /**
     *
     * @param bo
     * @param low
     * @param high
     * @param b1
     * @param g1
     * @param k
     */
    public void search(CommittedBoys[] bo,int low,int high,String[] b1,String[] g1,int k){
        if(low>high)
            return;
        int mid = low + ((high-low)/2);
        if(bo[mid].name.equals(b1[k]))
            g1[k] = bo[mid].girlfriend.name;
        else if(bo[mid].name.compareTo(b1[k])<0){
            search(bo,mid+1,high,b1,g1,k);
        }
        else
            search(bo,low,mid-1,b1,g1,k);
    }
}
