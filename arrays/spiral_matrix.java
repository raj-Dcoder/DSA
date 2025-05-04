package arrays;
import arrays.arrays;

public class spiral_matrix {
    public static void main(String[] args) {
        int rows = 3, cols = 3;
        int[][] mat = new int[rows][cols];

        mat = arrays.get_2d_array(mat, rows, cols);
        arrays.display(mat, 3, 3);

        System.out.println("Spiral Array:");
        System.out.println("-------------------------");

        // spiral display of matrix
        int startRow = 0, endRow = mat.length-1;
        int startCol = 0, endCol = mat[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j = startCol; j<=endCol; j++){
                System.out.print(mat[startRow][j]+" ");
            }
            //right
            for(int i = startRow+1; i<= endRow; i++){
                System.out.print(mat[i][endCol]+" ");
            }
            //bottom
            for(int j = endCol-1; j>=startCol; j--){
                System.out.print(mat[endRow][j]+" ");
            }
            //left
            for(int i = endRow-1; i>startRow; i--){
                System.out.print(mat[i][startCol]+" ");
            }
            startCol++;
            endCol--;
            startRow++;
            endRow--;
        }
    } 
}
