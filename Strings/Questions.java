package Strings;
import java.util.*;
public class Questions {
    public static int countLowerCaseVowels(String str) {
        int n = str.length();
        int counter =0;
        for(int i=0; i<n; i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
                counter++;
        }
        return counter;
    }
    
    public static boolean isAnagrams(String str1, String str2){
        //Normalize (remove spaces and comvert to lowercase)
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s1", "").toLowerCase();

        //check length
        if(str1.length()!=str2.length())
            return false;
        
        //sort and compare
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);        
    }
    public static void main(String[] args) {
        // String str = "aabbceeeooouuu";
        // System.out.println(countLowerCaseVowels(str));


        // String str0 = "ShradhaKhapra";
        // String str1 = "ApanCollege";
        // String str2 = "ShradhaKhapra";

        // System.out.println(str0.equals(str1)+" "+str0.equals(str2));

        // System.out.println(str1.replace('l', ' '));

        String str1 = "race", str2 ="rama";

        if(isAnagrams(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");

        char[] ca = str1.toCharArray();
        System.out.println(ca);

    }    
}
