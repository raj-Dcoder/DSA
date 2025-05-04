package Stack;
import java.util.*;
// reverse a string using stack

public class Q2 {

    static Stack<Character> stack = new Stack<>();

    //revesing method
    static StringBuilder reverseString(String str){
        pushCharIntoStack(str);
        return popingToString();
    }

    // pushing char to stack
    static void pushCharIntoStack(String str){
        for(int i=0; i<str.length(); i++){
            stack.push(str.charAt(i));
        }
    }

    // poping from stack 
    static StringBuilder popingToString(){
        StringBuilder sb = new StringBuilder("");
        while (!stack.empty()) {
            char top = stack.pop();
            sb.append(top);        
        }
        return sb;
    }
    public static void main(String[] args) {
        String str = "Rajveer";
        System.out.println(reverseString(str));        
    }
}
