public class NQueens {
    public static void doPrint(char ch[][]) {
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                System.out.print(ch[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char ch[][], int row, int col) {
        // top check
        for (int i = row; i >= 0; i--) {
            if (ch[i][col] == 'Q') {
                return false;
            }
        }
        // left diagonal check
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (ch[i][j] == 'Q') {
                return false;
            }
        }
        // right diagonal check
        for (int i = row, j = col; i >= 0 && j < ch[0].length; i--, j++) {
            if (ch[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char ch[][], int index) {
        if (index == ch.length) {
            doPrint(ch);
            System.out.println("-----------------------");
            return;
        }
        for (int i = 0; i < ch.length; i++) {
            if (isSafe(ch, index, i)) {
                ch[index][i] = 'Q';
                nQueens(ch, index + 1);
                ch[index][i] = 'x';
            }

        }

    }

    public static void main(String[] args) {
        int n=5;
        char ch[][] = new char[n][n];
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                ch[i][j] = 'x';
            }
        }
        nQueens(ch, 0);
    }
}
