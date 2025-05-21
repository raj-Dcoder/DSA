package BitManipulation;

public class nQinNrow {
    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int k = 0; k < row; k++) {
            if (board[k][col] == 'Q')
                return false;
        }
        // diag left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        // diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static void nQinNrow(char board[][], int row) {
        // base case
        if (row == board.length) {
            System.out.println("----chess board----");
            printBoard(board);
            count++;
            return;
        }
        // recursion case
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQinNrow(board, row + 1); // recursion step
                board[row][j] = '.'; // backtracking step
            }
        }
    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        // initialise
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        nQinNrow(board, 0);
        System.out.println("The total number of possible ways are: " + count);
    }
}