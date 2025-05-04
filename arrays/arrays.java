package arrays;
import java.util.Scanner;

public class arrays {
    // Search element 
    public static boolean search(int[][] mat, int key){
        for(int i =0; i<mat.length;i++){
            for(int j = 0; j<mat[0].length; j++){
                if(mat[i][j] == key){
                    System.out.println("Number found!!");
                    return true; 
                }              
            }
        }
        System.out.println("Number not found!");
        return false;
    }
    // Display 2D array
    public static void display(int[][] mat,int n, int m){ 
        for(int i =0; i<n;i++){
            for(int j = 0; j<m; j++){
                System.out.print(mat[i][j]+" ");                
            }
        System.out.println();
        }
    }
    // Get array
    public static int[][] get_2d_array(int[][] mat, int n, int m){
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<n;i++){
            for(int j = 0; j<m; j++){
                // System.out.print("Enter the elements for ("+i+","+j+"): ");
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return mat;
    }
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
    
        get_2d_array(matrix, n, m); // get array 
        display(matrix, n, m); // display array
    }
}
