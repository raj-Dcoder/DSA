package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaxAcitivity {
    public static void main(String[] args) { //O(n)
        //time frames of work
        int[] start = {1,3,0,5,8,5};
        int[] end   = {2,4,6,7,9,9};

        //sorting   O(logn)
        int[][] acitivities = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            acitivities[i][0] = i;
            acitivities[i][1] = start[i];
            acitivities[i][2] = end[i];
        }

        Arrays.sort(acitivities, Comparator.comparingDouble(o -> o[2])); //sort 2d array based on column 2(third column)

        int maxAct = 1; //already taken the first acitivity
        ArrayList<Integer> selectedActivitites = new ArrayList<>();

        selectedActivitites.add(0);
        int lastEnd = acitivities[0][2];
        for(int i=1; i<end.length; i++){
            //check and select
            if(lastEnd <= acitivities[i][1]){ // main logic
                maxAct++;
                lastEnd = acitivities[i][2];
                selectedActivitites.add(i);
            }
        }
        System.out.println("Maximum Activity = " + maxAct);
        for(int i=0; i<selectedActivitites.size(); i++){
            System.out.println(start[selectedActivitites.get(i)]+" -> "+end[selectedActivitites.get(i)]);
        }
    }
}
