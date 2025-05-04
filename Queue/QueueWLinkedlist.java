package Queue;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueWLinkedlist <T> implements Iterable<T> {
    private LinkedList<T> list = new LinkedList<T>();

    public QueueWLinkedlist(){}
    public QueueWLinkedlist(T firstElem){
       offer(firstElem);
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void offer(T elem){
        list.addLast(elem);
    }

    public void enqueue(T elem){
        list.addLast(elem);
    }
    public void dequeue(){
        list.removeFirst();
    }

    //TODO: Yet to define
    public void contains(){

    }
    public void peeking(){}
    public void displayQ(){}


    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    
}