package arrays;

public class digonalSum {
    public static int digSum(int[][] mat,int n, int m){

        int digonalSum = 0;

        // (bruteforce) with complexity O(n^2)
        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<m; j++){
        //         if (i == j)
        //             digonalSum+=mat[i][j];
        //         else if(i+j == m-1)
        //             digonalSum+= mat[i][j];
        //     }
        // }
        
        //  with complexity O(n)
        for( int i=0; i<n; i++){
            // pd
            digonalSum += mat[i][i];
            // sd
            if(i != n-1-i)
                digonalSum += mat[i][n-1-i];
        }
        return digonalSum;
    }

    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        int n = 3, m = 3;
        mat = arrays.get_2d_array(mat, n,m);
        arrays.display(mat, n, m);

        int sum = digSum(mat, n, m);
        System.out.println(sum);
    }
}
