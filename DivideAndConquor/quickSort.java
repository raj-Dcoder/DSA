package DivideAndConquor;

public class quickSort{
    private static void printArr(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void quickSort(int[] arr, int si, int ei){
        //step 1: select pivot as last element
        //step 2: partition 
        // partition(arr,)

    }
    public static void main(String[] args) {
        int[] arr = {4,2,6,7,8,1};
        quickSort(arr,0,arr.length);
        printArr(arr);
    }
}