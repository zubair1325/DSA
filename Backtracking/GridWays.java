public class GridWays {
    public static int totalWays(int m, int n, int i, int j) {
        if (i == m - 1 || j == n - 1) {
            return 1;
        }
        if (m == i || n == j) {
            return 0;
        }
        return totalWays(m, n, i + 1, j) + totalWays(m, n, i, j + 1);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(totalWays(n, 1, 0, 0));
    }
}
