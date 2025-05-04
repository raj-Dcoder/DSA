package Strings.leetcode;

public class removeOuterParentheses {
    public static String removeOuterParentheses(String s) {

        int left =0, right =0;
        int counter =0;
        StringBuilder sb = new StringBuilder("");

        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(')
                counter++;
            else if(s.charAt(i) == ')'){
                counter--;
                if(counter == 0){
                    right = i;
                    // sb.append(s.substring(left+1,right-1));
                    for(int j=left+1; j<right; j++){
                        sb.append(s.charAt(j));
                    }
                    left=i+1;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
}
