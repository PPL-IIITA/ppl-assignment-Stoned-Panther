package com.pushpendra.assignment.SortingBoys;

import com.pushpendra.assignment.Boy.CommittedBoys;

/**
 * Created by panther on 8/4/17.
 */
public class HashTable extends SortSearch {
    /**
     *
     * @param b
     * @param boys
     * @param girls
     * @param n
     */
    @Override
    public void Search(CommittedBoys[] b, String[] boys, String[] girls, int n) {
        CommittedBoys[] hashTable = new CommittedBoys[3000];
        for(int i = 0; i < 500; i++){
            int p  =returnIndex(b[i].name);
            while(hashTable[p]!=null)
                p = (p+1)%500;
            hashTable[p] = b[i];
        }
        for(int i = 0; i < n; i++){
            int p = returnIndex(boys[i]);
            while (hashTable[p].name.equals(boys[i])==false){
                p = (p+1)%500;
            }
            girls[i] = hashTable[p].girlfriend.name;
        }
    }

    /**
     *
     * @param st
     * @return
     */
    public int returnIndex(String st){
        int l = st.length(),p=0;
        for(int j = 0; j <l; j++){
            p=p+st.charAt(j);
        }
        int t = st.charAt(0)+st.charAt(l-1);
        p = p/t;
        return p%500;
    }
}
