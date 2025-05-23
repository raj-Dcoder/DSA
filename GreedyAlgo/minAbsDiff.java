package GreedyAlgo;

import java.util.Arrays;

public class minAbsDiff {
    public static void main(String[] args) { //O(nlogn)
        int[] A = { 4, 9, 8, 1 };
        int[] B = { 2, 3, 1, 7 };
        int S = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        //sorted Arrays
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        for (int i = 0; i < A.length; i++) {
            S += Math.abs(A[i] - B[i]);
        }
        System.out.println("The Sum of Absolute Min Difference: " + S);
    }
}
