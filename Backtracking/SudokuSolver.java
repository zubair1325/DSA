public class SudokuSolver {
    public static void doPrint(int ch[][]) {
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                System.out.print(ch[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int arr[][], int row, int col, int num) {
        // row and col check
        for (int i = 0; i < 9; i++) {
            // col
            if (arr[row][i] == num) {
                return false;
            }
            // row
            if (arr[i][col] == num) {
                return false;
            }
        }
        int a = (row / 3) * 3;
        int b = (col / 3) * 3;
        for (int i = a; i <= a + 2; i++) {
            for (int j = b; j <= b + 2; j++) {
                if (arr[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void sudoku(int arr[][], int row, int col) {
        if (row == 9 && col == 0) {
            doPrint(arr);
            System.out.println("------------------------------------");
            return;
        }
        int newCol = col+1, newRow = row;
        if (col+1 == 9) {
            newRow = row + 1;
            newCol = 0;

        }
        if(arr[row][col] != 0){
            sudoku(arr, newRow, newCol);
            return ;
        }
        for (int i = 1; i <= 9; i++) {
            if (isSafe(arr, row, col, i )) {
                arr[row][col] = i;
                sudoku(arr, newRow, newCol);
                arr[row][col] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        sudoku(sudoku, 0, 0);
    }
}
