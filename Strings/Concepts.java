package Strings;
// import java.util.Scanner;

public class Concepts {
    public static void printLetters (String str) {
        for( int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        // String str = new String();
        // str = "Rajveer";

        // Strings are IMMUTABLE \\

        // System.out.println(str);
        // Scanner sc = new Scanner(System.in);
        // str = sc.nextLine();
        // System.out.println(str);
        // System.out.println(str.length());

        // Concatination \\

        // String fName = "Rajveer";
        // String mName = "Singh";
        // String lName = "Rana"; 
        // String fullName = fName + " " + mName + " " + lName;
        // System.out.println(fullName);

        // Accessing characters of String \\

        // System.out.println(fName.charAt(5));
        // printLetters(fullName);
        // System.out.println();

        // Strings Comparision \\

        // String s1 = "Raj";
        // String s3 =  new String("Raj");

        // if(s1 == s3)  // return not same cuz it check object
        //     System.out.println("Same");
        // else
        //     System.out.println("Not same"); 

        // if(s1.equals(s3)) // correct way to compare strings
        //     System.out.println("Equal"); 

        // Substring \\

        // String str = "HelloMars";
        // System.out.println(str.substring(0,5));        

        // StringBuilder \\

        // StringBuilder sb = new StringBuilder("");
        // sb.toString();

        // for(char ch='a'; ch<='z'; ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb.length());
        // here complexity is O(26) only and not (n^2) as of String 

        // intern() \\

        // String str1 = "Rajveer";
        // String str2 = new String("Rajveer");
        // System.out.println(str2.intern() == str1 );

        // Stirngbuffer \\

        // StringBuffer sb = new StringBuffer("Rajveer"); // slower than StirngBuilder but useful  
        // sb.append(" Singh");                           //  when thread-safety is important
        // System.out.println(sb);

        // sb.insert(0, "Mr. ");
        // System.out.println(sb);

        // sb.delete(0, 4);
        // System.out.println(sb);

        // sb.reverse();
        // System.out.println(sb);
    }
}
