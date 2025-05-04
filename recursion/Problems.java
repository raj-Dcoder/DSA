package recursion;

import java.math.BigInteger;

public class Problems{
    // print from n to 1
    static void printNto1(int n){
        if (n==1) {
            System.out.print(1+" ");
            return;
        }
        System.out.print(n+" ");
        printNto1(n-1);
    }
    // print from 1 to n
    static void print1toN(int n){
        if (n == 1){
            System.out.print(1+" ");
            return;
        }
        print1toN(n-1);
        System.out.print(n+" ");
    }
    // factorial of n
    public static BigInteger factorial(int n){
        // to handle the int overflow we can use BitInteger class which holds larger values
        if(n == 0){
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }
    // sum of n numbers
    static int sumOfN(int n){
        if(n==1) return 1;
        return n + sumOfN(n-1);
    }
    // is array sorted or not 
    static boolean isSorted(int[] arr, int index){
        if(index == arr.length-1)
            return true;
        if(arr[index]>arr[index+1])
            return false;
        return isSorted(arr, index+1);
    }
    static int power(int x, int n){
        // TC: O(n)
        // if(n==1)
        //     return x;
        // return x*power(x, n-1);

        // TC: O(logn)
        if(n==0)
            return 1;
        return x*power(x,n/2)*power(x,n/2);
    }

    static int tilingFloorProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        int fv = tilingFloorProblem(n-1);
        int fh = tilingFloorProblem(n-2);

        return fv + fh ;
    }
    public static void main(String[] args) {
        System.out.println(tilingFloorProblem(4));
    }
    //create a java funtion for quick sorted
    
}
