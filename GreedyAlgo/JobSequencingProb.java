package GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencingProb {//give me the sequece with max profits
    static class Job{
        int deadline;
        int profit;
        int id;

        Job(int i, int d, int p){
            deadline = d;
            profit =p;
            id = i;
        }
    }

    public static void main(String[] args) {
        int jobinfo[][] = {{4,20}, {1,10}, {1,40}, {1,30}};

        //sorting
        ArrayList<Job> jobs = new ArrayList<>();
        
        for(int i=0; i<jobinfo.length; i++){
            jobs.add(new Job(i, jobinfo[i][0],jobinfo[i][1]));
        }
       
        Collections.sort(jobs, (obj1, obj2)->obj2.profit - obj1.profit);//sorting 

        //algo to print
        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Total Jobs: "+seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i)+" ");
        }
    }
    
}
