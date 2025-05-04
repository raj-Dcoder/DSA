public class Sorting {

    // Bubble sort
    static void bubblesort(int arr[], int n)
    {
        for ( int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Insertion sort
    static void insertion_sort(int[] arr, int n){
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            // Move elements of arr[0..i-1], that are 
            // greater than key, to one position ahead 
            // of their current position 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    }

    // Quick Sort 


    public static void main(String[] args) {
        int[] arr = {2,3,4,61,3,};

        // bubblesort(arr,arr.length);
        // insertion_sort(arr, 5);
        
        for( int num : arr){
            System.out.print(num+" ");
        }

    }

}