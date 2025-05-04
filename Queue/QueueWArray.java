package Queue;

public class QueueWArray {
    int[] arr;
    int start, end;
    int maxSize, currSize;
    QueueWArray(){
        arr= new int[100];
        start = 0;
        end = 0;
        currSize = 0;
        maxSize=100;
    }
    QueueWArray(int size){
        arr = new int[size];
        start = 0;
        end = 0;
        currSize = 0;
        this.maxSize = size;
    }
    public int size(){
        return currSize;
    }

    public void push(int elem){
        if(currSize == maxSize)
            System.out.print("Queue is already full");

        arr[end%maxSize] = elem; 
        end++;   
        currSize++;

    }
    public int pop(){
        if(start == 0){
            return -1;
        }
        int popped = arr[start%maxSize];
        start++;
        currSize--;
        return popped;
    }

    public void displayQ(){
        for(int i=start; i<end; i++){
            System.out.print(arr[i%maxSize]+" ");
        }
        System.out.println();
    }

}
