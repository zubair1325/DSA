import java.util.ArrayList;
import java.util.List;

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

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char ch[][] = new char[n][n];
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                ch[i][j] = '.';
            }
        }
        nQueens(ans, ch, 0);
        return ans;

    }

    public static void addToList(List<List<String>> ans, char ch[][]) {
        String temp = "";
        List<String> l = new ArrayList<>();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                temp += ch[i][j];
            }
            l.add(temp);
            temp = "";

        }
        ans.add(new ArrayList<>(l));
    }

    public static void nQueens(List<List<String>> ans, char ch[][], int index) {
        if (index == ch.length) {
            addToList(ans, ch);
            return;
        }
        for (int i = 0; i < ch.length; i++) {
            if (isSafe(ch, index, i)) {
                ch[index][i] = 'Q';
                nQueens(ans, ch, index + 1);
                ch[index][i] = 'x';
            }

        }

    }

    public static void main(String[] args) {
        List<List<String>> ans = solveNQueens(5);
        solveNQueens(5);
    }
}
