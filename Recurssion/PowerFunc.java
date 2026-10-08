public class PowerFunc {
    public static double myPow(double x, int n) {
        if (x == 0)
            return 0;

        long N = n;
        if (N < 0) {
            N = -N;
        }

        double result = myPowHelper(x, N);

        return n < 0 ? 1.0 / result : result;
    }

    private static double myPowHelper(double x, long n) {
        if (n == 0) {
            return 1;
        }

        double half = myPowHelper(x, n / 2);
        half *= half;

        if (n % 2 != 0) {
            half = half * x;
        }

        return half;
    }

    public static void main(String[] args) {
        double x = 2;
        int y = -3;
        System.out.println(myPow(x, y));
    }
}
