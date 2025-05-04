package Stack;
import java.util.Stack;

public class nextGreater {
    public static int[] nextGreater(int[] ar, int[] ng){
        Stack<Integer> stack = new Stack<>();
        int n = ar.length;

        for(int i=n-1; i>=0; i--){
            // 1> pop
            while (!stack.empty() && ar[stack.peek()] <= ar[i]) {
                stack.pop();
            }
            
            // 2> set nextGreater
            if (stack.empty()) {
                ng[i]=-1;
            }
            else{
                ng[i]=stack.peek();
            }

            // 4> push to stack
            stack.push(i);
        }
        return ng;
    }
    public static void main(String[] args) {
        int[] array = {1,1,2,3,4,2,1};
        int[] nextGreater = new int[array.length];

        nextGreater = nextGreater(array, nextGreater);
        // display
        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
}
