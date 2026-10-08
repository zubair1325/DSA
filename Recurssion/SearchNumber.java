public class SearchNumber {
    public static boolean isNumberFound(int arr[], int n, int key) {
        if (n == arr.length) {
            return false;
        }
        if (arr[n] == key) {
            return true;
        }
        return isNumberFound(arr, n + 1, key);
    }

    public static void main(String[] args) {
        int arr []  ={1,2,3,4,5,6,7,8};
        System.out.println(isNumberFound(arr, 0, 10));

    }
}
