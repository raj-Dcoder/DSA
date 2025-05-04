package arrays;

public class Quesions {

    public static int search(int[][] arr, int key){
        int counter = 0;
        for(int i = 0; i < arr.length; i++){        // bruteforce method, takes O(n^2)
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == key)
                    counter++;
            }
        }
        return counter;
    }

    public static void printRow(int[][] arr, int row){
        int sum = 0;

        for(int j = 0; j < arr[0].length; j++){ //lenear complexity O(m)
            sum += arr[row-1][j];
        }
        System.out.println("Sum of element of row " + row + "is : " + sum);
    }

    public static int[][] transpose(int[][] arr){
        // int i = 0, j = 0;
        // while (j < arr[0].length){
        //     int temp = arr[i][j];
        //     arr[i][j] = arr[j][i];
        //     arr[j][i] = temp;
        //     j++;
        //     if (j == arr[0].length-1 && i < arr.length-1){
        //         i++;
        //         j=i;
        //     }
        // }

        int rowCount = arr.length;
        int colCount = arr[0].length;
        int[][] transposedArr = new int[colCount][rowCount]; // Use a new matrix for transpose

        for(int i = 0; i < rowCount; i++){
            for(int j = 0; j < colCount; j++){
                transposedArr[j][i] = arr[i][j];
            }
        }
        return transposedArr;
    }
    
    public static void main(String[] args) {
        int[][] array = {
            {7,3,7},
            {4,2,7},
            {1,2,3}
        };

        // int count = search(array, 7);
        // System.out.println("Number of 7s in array is: "+count);
        // printRow(array, 2);

        array = transpose(array);
        
       arrays.display(array, 3, 3);
    }
}
// if in the future you get other method 
// please solve in lower complexity
