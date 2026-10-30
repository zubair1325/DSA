public class InsertionSort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int index = i - 1;
            int value = arr[i];
            while (index >= 0 && arr[index] > value) {
                arr[index + 1] = arr[index];
                index--;
            }
            
            arr[index + 1] = value;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 8, 3, 9, 2, 1 };
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
