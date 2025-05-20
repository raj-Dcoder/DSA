package Stack;

import java.util.Stack;

public class validParenthesis {
    static boolean validatorParenthesis(String str){
        Stack<Character> ch = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                ch.push(str.charAt(i));
            }
            else if ((str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']')) {
                if(ch.isEmpty()){//self determined
                    return false;
                }
                else if (
                    ch.peek()== '(' && str.charAt(i)==')' ||
                    ch.peek()== '{' && str.charAt(i)=='}' ||
                    ch.peek()== '[' && str.charAt(i)==']'
                ) {
                    ch.pop();
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        if (!ch.isEmpty()) {
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        String str = "(())[]{})";
        if (validatorParenthesis(str)) {
            System.out.println("valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
