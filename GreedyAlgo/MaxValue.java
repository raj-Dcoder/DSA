package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;


public class MaxValue {
    public static void main(String[] args) {
        int[] value = {60,100,120};
        int[] weight = {10,20,30};
        int capacity = 50;

        //making 2d Array to arrange and sort using Comparator
        double[][] ratio = new double[value.length][2];


        for(int i = 0; i<weight.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }


        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o-> o[1]));



        double maxValue = 0;
        for(int i=ratio.length-1; i>=0; i--){//taking reverse way as sorting was ascending
            int index = (int) ratio[i][0];
            if(capacity>=weight[index]){
                capacity-=weight[index];
                maxValue += value[index]; 
            }else{
                maxValue += ratio[i][1]*capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("Max Value fo the knapsack: "+maxValue);
    }
    
}
