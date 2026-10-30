public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int low = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[low] > arr[j]) {
                    low = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[low];
            arr[low] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 8, 3,9, 2, 1 };
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
