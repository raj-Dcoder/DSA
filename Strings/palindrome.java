package Strings;

public class palindrome{

    public static boolean paliCheck(String str){
        int n = str.length();
        for(int i = 0; i < n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("String is not palindrome");
                return false;
            }
        }
        System.out.println("String is palindrome");
        return true;
    }
    public static void main(String[] args) {
        String str1 = "racecar", str2 = "rajveer";

        paliCheck(str1);
        paliCheck(str2);
    }
}
// complexity of the algo is linear i.e., O(n)