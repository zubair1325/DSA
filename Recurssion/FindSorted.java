public class FindSorted {
    public static boolean isSorted(int arr[], int n) {
        if (n == arr.length - 1) {
            return true;
        } else if (arr[n - 1] > arr[n]) {
            return false;
        }
        return isSorted(arr, n + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(isSorted(arr, 1));

    }
}
