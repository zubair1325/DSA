public class FindOccurrence {
    public static int findFirstOccurrence(int arr[], int key, int n) {
        if (n == arr.length) {
            return -1;
        }
        if (arr[n] == key) {
            return n;
        }
        return findFirstOccurrence(arr, key, n + 1);

    }

    public static int findLastOccurrence(int arr[], int key, int n) {
        if (n == -1) {
            return -1;
        }
        if (arr[n] == key) {
            return n;
        }
        return findLastOccurrence(arr, key, n - 1);

    }

    public static int findLastOccurrence2(int arr[], int key, int n) {
        if (n == -1) {
            return -1;
        }

        int a = findLastOccurrence(arr, key, n - 1);
        if (arr[n] == key && a == -1) {
            return n;
        }
        return a;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 5, 8, 9, 7, 6, 7, 8 };
        System.out.println(findFirstOccurrence(arr, 7, 0));
        System.out.println(findLastOccurrence2(arr, 7, arr.length - 1));
    }
}
