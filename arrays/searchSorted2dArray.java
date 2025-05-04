package arrays;

public class searchSorted2dArray {
    public static boolean search(int[][] mat, int key){
        // int row = 0, col = mat[0].length-1; //starting from top right corner

        // while (row < mat.length && col >= 0) {
        //     if(mat[row][col] == key){
        //         System.out.println("Key found at (" + row + "," + col + ")");
        //         return true;
        //     }
        //     else if (key < mat[row][col])
        //         col--;
        //     else 
        //         row++;                  
        // }
        // System.out.println("Key not found !!");
        // return false;

        int row = mat.length-1, col = 0; // starting from bottom left corner

        while ( row >= 0 && col < mat[0].length){
            if(mat[row][col] == key){
                System.out.println("Key found at (" + row + "," + col + ")");
                return true;
            } 
            else if (key > mat[row][col])
                col++;
            else
                row--;
        }
        System.out.println("Key not found !!");
        return false;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int mat[][] = new int[n][m];

        mat = arrays.get_2d_array(mat, n, m);
        System.err.println("-----------------------");
        arrays.display(mat, n, m);  

        int key = 3;

        search(mat, key);
    }
}

// this algo is called staircase method
// it's complexity is O(n+m)
// cuz worst you can travel is n+m which is less than the bruteforce
// brute force will take O(n^2)