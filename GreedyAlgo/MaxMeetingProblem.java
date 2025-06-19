package GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMeetingProblem {

    static class Meeting{
        int start;
        int end;

        Meeting(int s, int e){
            start = s;
            end = e;
        }
    }
    public static int maxMeetings(int[] start, int[] end) {

        ArrayList<Meeting> meetings = new ArrayList<>();

        for(int i=0; i<start.length; i++){
            meetings.add(new Meeting(start[i], end[i]));
        }

        // sorting the objects here
        Collections.sort(meetings, (obj1, obj2)->obj1.end - obj2.end);//sorting 

        int count=1;
        int currEnd = meetings.get(0).end;

        for(int i=1; i<meetings.size(); i++){
            if(currEnd <= meetings.get(i).start){
                count++;
                currEnd = meetings.get(i).end;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] start = {1,2,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        System.out.println(maxMeetings(start, end));
    }
}