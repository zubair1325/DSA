import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;

        List<Integer> solve = new LinkedList<>();

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                solve.add(matrix[rowStart][i]);
            }
            for (int i = rowStart + 1; i <= rowEnd; i++) {
                solve.add(matrix[i][colEnd]);
            }
            for (int i = colEnd - 1; i >= colStart; i--) {
                if (rowStart == rowEnd) {
                    break;
                }
                solve.add(matrix[rowEnd][i]);
            }
            for (int i = rowEnd - 1; i > rowStart; i--) {
                if (colStart == colEnd) {
                    break;
                }
                solve.add(matrix[i][colStart]);
            }
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
        return solve;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> solve = new LinkedList<>();
        solve = spiralOrder(matrix);
        for (int i = 0; i < solve.size(); i++) {
            System.out.print(solve.get(i)+" ");
        }
    }
}
