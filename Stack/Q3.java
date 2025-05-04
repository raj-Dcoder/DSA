package Stack;

import java.util.Stack;

// reverse the stack using recursion
public class Q3 {
    public static void reverseStack(Stack<Integer> s) {
        if (s.empty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.empty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        // 3, 2, 1
        printStack(stack);
        reverseStack(stack);
        // 1, 2, 3
        printStack(stack);
    }
}
