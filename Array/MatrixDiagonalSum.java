public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int maxSum = 0;
        for (int i = 0; i < mat.length; i++) {
            if (i != mat.length - 1 - i) {
                maxSum += mat[i][mat.length - 1 - i];
            }
            maxSum += mat[i][i];

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(diagonalSum(matrix));
    }
}
