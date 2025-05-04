package DivideAndConquor;

public class MergeSort {
    public static void mergesort(int[] arr, int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
        // step1: divide
        int mid = si+((ei-si)/2);// -> (si+ei)/2
        mergesort(arr, si, mid); // left 
        mergesort(arr, mid+1, ei);// right
        //step2: conquor
        merge(arr, si, mid, ei); //sorted part
    }
    public static void merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei-si+1];
        int i = si;//left array iterator
        int j = mid+1;//right array iterator
        int k = 0;//temp array iterator

        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
                
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //when left part is remaining and right part finished 
        while (i<=mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        //when left part is remaining and right part finished 
        while (j<=ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        // making copy of origianl array
        for(k=0,i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,5,9,10,1,-9,4};
        mergesort(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
