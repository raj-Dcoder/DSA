public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {1,9,4,7,10,11,3,2};
        int[] sortedArray = selSort(arr);

        for (int i : sortedArray) {
            System.out.print(i+
            " ");
        }
    }
    static int[] selSort(int[] arr){
        int size = arr.length;

        for(int i=0; i<size-1; i++){
            int smallest = i;
            for(int j=i+1; j<size; j++){
                if(arr[smallest]>arr[j])
                    smallest = j;
            }
            //swap
            // arr[i]=arr[i]+arr[smallest];
            // arr[smallest]=arr[i]-arr[smallest];
            // arr[i]=arr[i]-arr[smallest];

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}