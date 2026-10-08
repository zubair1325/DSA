public class PrintNumber {
    public static void printNumberIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printNumberIncreasing(n - 1);
        System.out.print(n + " ");

    }

    public static void printNumberDecreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumberIncreasing(n - 1);

    }

    public static void main(String[] args) {
        printNumberIncreasing(10);
        printNumberDecreasing(10);
    }
}
