package Strings;

public class compareStringsLexicographically {
    public static void main(String[] args) {
        String s1[] = {"apple","mango","banana"};

        String largest = s1[0];
        for(int i = 1; i < s1.length; i++){
            if(largest.compareToIgnoreCase(s1[i]) < 0) { //
                largest = s1[i];
            }
        }

        System.out.println(largest);
    }
}
