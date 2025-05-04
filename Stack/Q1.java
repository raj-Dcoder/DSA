package Stack;
import java.util.*;
// push at the bottom of the stack
public class Q1 {
     public static void pushAtBottom(Stack<Integer> stack, int data){
             if(stack.isEmpty()){
                 stack.push(data);
                 return;
             }
             int top = stack.pop();
             pushAtBottom(stack, data);
             stack.push(top);
         }
         public static void main(String[] args) {
             Stack<Integer> stack = new Stack<>();
     
             stack.push(1);
             stack.push(2);
             stack.push(3);
             pushAtBottom(stack, 4);
        System.out.println(stack);
    }
 }
