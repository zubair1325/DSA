public class RecursionInLoop {
    public static void branch(int n) {
        if (n == 0) {
            return; // Base case: stop and unwind
        }

        for (int i = 0; i < n; i++) { // Loops i = 0, then i = 1
            System.out.println("Level " + n + ", Loop i=" + i);
            branch(n - 1); // Pauses current loop here!
        }
    }

    public static void main(String[] args) {
        branch(2);
    }
}
