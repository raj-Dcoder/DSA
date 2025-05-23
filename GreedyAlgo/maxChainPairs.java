package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class maxChainPairs {
    public static void main(String[] args) {//O(nlogn)
        //inputs
        int[][] X = {
            {5,24},
            {39,60},
            {5,28},
            {27,40},
            {50,90}
        };

        //sorting
        Arrays.sort(X, Comparator.comparingDouble(o ->o[1]));

        int chainLen = 1;
        int chainEnd = X[0][1];
        //calculating
        for(int i=1; i<X.length;i++){
            if(chainEnd < X[i][0]){
                chainEnd = X[i][1];
                chainLen++;
            }
        }
        System.out.println("Max length: "+chainLen);

    }
}
