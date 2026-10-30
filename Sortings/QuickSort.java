public class QuickSort {
    public static void quickSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int pivotIndex = findpivotIndex(arr, start, end);
        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }

    public static int findpivotIndex(int arr[], int start, int end) {
        int index = start-1;
        for (int j = start; j <= end - 1; j++) {
            if (arr[end] > arr[j]) {
                index++;
                int temp = arr[j];
                arr[j] = arr[index];
                arr[index] = temp;
            }
        }
        index++;
        int temp = arr[end];
        arr[end] = arr[index];
        arr[index] = temp;
        return index;

    }

    public static void main(String[] args) {

        int arr[] = { 6, 3, 9, 5, 2, 8 };
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");

        }
    }
}
