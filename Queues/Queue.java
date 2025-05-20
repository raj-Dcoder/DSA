package Queues;

/*
 Queue implementation using array
*/
public class Queue {
    static int[] arr;
    static int rear=-1,
     front=0;

    Queue(int n){
        arr = new int[n];
        rear = -1;
        front = -1;
    }

    //add
    public static void add(int x){
        if(rear == arr.length-1){
            System.out.println("Queue is full");
            return ;
        }
        arr[++rear] = x;
    }
    //remove
    public static void remove(){
        if(rear == -1){
            System.out.println("Queue is empty");
            return ;
        }
        for(int i = front; i<rear; i++){
            arr[i]=arr[i+1];
        }
        rear--;
    }

    //peek
    public static int peek(){
        if(rear == -1){
            System.out.println("");
            return -1;
        }
        return arr[0];
    }
    


public static void main(String[] args) {
    Queue q = new Queue(6);

    q.add(5);
    q.add(9);
    q.add(5);
    q.add(9);
    q.add(5);
    q.add(9);
    q.remove();

    for(int i=0;i<=q.rear ;i++){
        System.out.println(q.arr[i]);
    }
}
    
}