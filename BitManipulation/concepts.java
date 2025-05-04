package BitManipulation;
public class concepts {
    public static void oddOrEven(int n) {
        int Bitmask = 1;
        if((n & Bitmask) == 1)
            System.out.println("Odd Number");
        else 
            System.out.println("Even Number");
    }
    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int clearLastIBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static int clearRangeBits(int n, int i, int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }
    public static int countSetBits(int n){
        int count = 0;

        while(n>0){
            // check LSB 
            if((n & 1) == 1)
                count++;
            n=n>>1;
        }
        return count;
    }
    public static int fastExpo(int a, int n){
        int ans =1;
        while (n>0) {
            if ((n & 1) != 0) {
                ans *= a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // System.out.println(fastExpo(3, 5));
        System.out.println( (0 | 0 | 0) );
    }
}
