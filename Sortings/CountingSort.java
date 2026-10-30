public class CountingSort {
    public static void countingSort(int arr[]) {
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxNumber = Math.max(maxNumber, arr[i]);

        }

        int temp[] = new int[maxNumber + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }
        for (int i = 0, j = 0; i < temp.length; i++) {
            while (temp[i] > 0) {
                arr[j++] = i;
                temp[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 8, 3, 9, 2, 1 };
        countingSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
