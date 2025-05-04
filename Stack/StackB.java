package Stack;
import java.util.*;

public class StackB {
    // using ArrayList
    static class StackUsingArrayList{
        static ArrayList<Integer> list = new ArrayList<>();

        /*methods*/
        // isEmpty
        public static boolean isEmpty(){
            return (list.size() == 0);
        }
        // push
        public static void push(int e){
            list.add(e);
        }
        // pop
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // peek   
        public static int peak(){
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        } 
    }
    
    // using LL
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class StackUsingLL{


        static Node head = null;

        // empty
        public static boolean isEmpty(){
            return (head == null);
        }

        // push
        public static void push(int e){
            Node newNode = new Node(e);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;   
        }

        // pop
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
            
        }
          
        // peek   
        public static int peak(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        } 
    }
    
    public static void main(String[] args) {
        // StackUsingArrayList stack = new StackUsingArrayList();
        // StackUsingLL stack = new StackUsingLL();

        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(3);
        stack.push(4);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }    
    }
}