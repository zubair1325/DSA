public class Search2DSortedMatrix {
    // time complexity n log(n)
    public static boolean searchMatrix1(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }

    // time complexity log(m*n)
    public static boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int a = matrix.length;
        int b = matrix[0].length;
        int start = 0;
        int end = a * b - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int row = mid / b;
            int col = mid % b;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {

                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int idx = findTargetRow(matrix, target);
        if (idx == -1) {
            return false;
        }
        boolean isNumberFound = findTargetNumber(matrix, target, idx);
        return isNumberFound;
    }

    public static boolean findTargetNumber(int matrix[][], int target, int idx) {
        int start = 0;
        int end = matrix[0].length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[idx][mid] == target) {
                return true;
            } else if (matrix[idx][mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static int findTargetRow(int matrix[][], int target) {
        int start = 0;
        int end = matrix.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[mid][0] <= target && matrix[mid][matrix[0].length - 1] >= target) {
                return mid;
            } else if (matrix[mid][0] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 1} };
        System.out.println(searchMatrix(matrix, 9));
    }
}
