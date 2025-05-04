package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class questions {

    // what is the value of x^x for any value x?
    public static int powerOfXtoX(int n){
        int ans = 1, times = 1;
        int power = n;

        if (n == 0) {
            System.out.println("undefined"); 
        }

        while(power > 0){
            if ((power & 1) != 0){
                for (int i=0; i<times; i++) ans*=n;
                times*=2;
            }else{
                times*=2;
            }
            power = power>>1;
        }
        return ans;
    }   
    // swap two numbers without using any third variable?
    public static void swap(int x, int y){
        System.out.println("Before Swapping: ");
        System.out.println("x ="+x+", y ="+y);

        for(int i =0; i<32; i++){
            int bitMask = 1<<i;
            if (((bitMask&x) != (bitMask&y))){
                x^=bitMask;
                y^=bitMask;
            }
        }
        System.out.println("After Swapping: ");
        System.out.println("x ="+x+", y ="+y);

    }
    // add 1 to an integer using Bit BitManipulation 
    public static int add1(int n){
        for (int i=0; i<32; i++){
            int bitMask = 1<<i;
            if((bitMask&n) == 1)
                n&=~bitMask;
            else{
                n|=bitMask;
                break;
            }
        }
        return n;
    }
    // (this question is based on a trick please directly look at the solution.) Convert uppercase to lowercase using bits.
    // without using bit
    public static String uppercaseToLowercaseWithoutBit(String s){
        StringBuilder sb = new StringBuilder("");
        char[] charArray = s.toCharArray();
        int i=0;
        while(sb.length()!=s.length()){
            char ch = (char)((int)(charArray[i]) + 32);
            sb.append(ch);
            i++;
        }
        return sb.toString();
    }
    // with using bit
    // public static String uppercaseToLowercaseWithBit(String s){

    // }
    public static void main(String[] args) {
        // swap(22, 66);
        // System.out.println(add1(1022));
        // System.out.println(uppercaseToLowercaseWithoutBit("RAJVEER"));

        List<String> list = new ArrayList<>();
    }
}
