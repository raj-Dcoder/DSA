package Queues;

import java.util.*;

public class QueueUsingQue {
    public static class Queue{
        Deque<Integer> q = new LinkedList<>();

        Queue(){}

        //add
        public void add(int x){
            q.addLast(x);
        }
        
        //remove
        public int remove(){
          return q.removeFirst();
        }

        //peek
        public int peek(){
           return  q.getFirst();
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
    
}
