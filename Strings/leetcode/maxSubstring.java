package Strings.leetcode;
import java.util.Arrays;
public class maxSubstring {
    public static int lengthOfLongestSubstring(String s) {
        char[] charStr = s.toCharArray();
        int maxCount = 0;
        for (int i=0; i<charStr.length-1; i++){
            int counter = 0;
            for (int j=i+1; j<charStr.length; j++){
                if(charStr[i]==charStr[j])
                    break;
                counter++;
            }
            if(counter > maxCount)
                maxCount = counter;
        }
        return maxCount;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        
        // System.out.println(lengthOfLongestSubstring(str));

        int[] charIndex = new int[128];
        Arrays.fill(charIndex,-1);
        charIndex['a'] = 1;
        System.out.println(charIndex[97]);

    }
}
