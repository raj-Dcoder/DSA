package GreedyAlgo;

import java.util.ArrayList;

public class MaxAcitivity {
    public static void main(String[] args) { //O(n)
        //time frames of work
        int[] start = {1,3,0,5,8,5};
        int[] end   = {2,4,6,7,9,9};

        int maxAct = 1; //already taken the first acitivity
        ArrayList<Integer> selectedActivitites = new ArrayList<>();

        selectedActivitites.add(0);
        int lastEnd = end[0];
        for(int i=1; i<end.length; i++){
            //check and select
            if(lastEnd <= start[i]){ // main logic
                maxAct++;
                lastEnd = end[i];
                selectedActivitites.add(i);
            }
        }
        System.out.println("Maximum Activity = " + maxAct);
        for(int i=0; i<selectedActivitites.size(); i++){
            System.out.println(start[selectedActivitites.get(i)]+" -> "+end[selectedActivitites.get(i)]);
        }
    }
}
