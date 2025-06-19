package GreedyAlgo;

import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args) {

        Integer vc[] = {2,1,3,1,4};
        Integer hc[] = {4,1,2}; 

        //sorting cutarrays
        Arrays.sort(vc, Collections.reverseOrder());
        Arrays.sort(hc, Collections.reverseOrder());

        int h=0, v=0;
        int hp=1, vp=1;
        int cost = 0;
        while (h<hc.length && v<vc.length) {
            if (vc[v] >= hc[h]) {
                cost += hp*vc[v];
                vp++;
                v++; 
            }else{
                cost += vp*hc[h];
                hp++;
                h++;
            }
        }
        while (h<hc.length) {
            cost += vp*hc[h];
            hp++;
            h++;
        }
        while (v<vc.length) {
            cost += hp*vc[v];
            vp++;
            v++; 
        }

        System.out.println("Total Minimum Cost: "+cost);
    }    
}
