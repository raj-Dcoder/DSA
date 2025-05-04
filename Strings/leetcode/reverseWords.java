package Strings.leetcode;

public class reverseWords {
    public static String reverseWordsOfString(String s){
        String[] words = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1; i>=0; i--){
            sb.append(words[i]);

            if(i!=0) sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "this is the statement";
        System.out.println(reverseWordsOfString(s));
    }
}