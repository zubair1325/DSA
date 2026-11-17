public class SudokuSolver {
    public static void doPrint(char ch[][]) {
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                System.out.print(ch[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char arr[][], int row, int col, char num) {
        // row and col check
        for (int i = 0; i < 9; i++) {
            // col
            if (arr[row][i] == (num)) {
                return false;
            }
            // row
            if (arr[i][col] == (num)) {
                return false;
            }
        }
        int a = (row / 3) * 3;
        int b = (col / 3) * 3;
        for (int i = a; i <= a + 2; i++) {
            for (int j = b; j <= b + 2; j++) {
                if (arr[i][j] == (num)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudoku(char arr[][], int row, int col) {
        if (row == 9 && col == 0) {
            doPrint(arr);
            return true;
        }
        int newCol = col + 1, newRow = row;
        if (col + 1 == 9) {
            newRow = row + 1;
            newCol = 0;

        }
        if (arr[row][col] != '.') {
            return sudoku(arr, newRow, newCol);
        }
        for (int i = 1; i <= 9; i++) {
            char digit = (char) (i + '0');
            if (isSafe(arr, row, col, digit)) {
                arr[row][col] = digit;
                if (sudoku(arr, newRow, newCol)) {
                    return true;
                }
                arr[row][col] = '.';
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        sudoku(board, 0, 0);
    }
}
