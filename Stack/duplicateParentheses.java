package Stack;

import java.util.Stack;

public class duplicateParentheses {
    static boolean isduplicate(String str) {
        Stack<Character> st = new Stack<>();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ')') {
                st.push(str.charAt(i));
            } else if (st.isEmpty()) {
                return false;
            } else {
                counter = 0;
                while (st.peek() != '(') {
                    st.pop();
                    counter++;
                }
                st.pop();
                if (counter < 1) {
                    break;
                }
            }
        }
        if (counter < 1) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String str = "((a+b)*(a))";
        if (isduplicate(str)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
