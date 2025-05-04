package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class problems {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int i=5;
        Random rand = new Random();
        while(--i>0){
            list.add((rand.nextInt(50)));
        }
        i=i-1;
        while(++i <5){
            System.out.println(list.get(i));
        }        
    }
}
