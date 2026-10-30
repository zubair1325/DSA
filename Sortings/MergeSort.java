public record MergeSort() {
    public static void divideAndConquer(int arr[], int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        divideAndConquer(arr, start, mid);
        divideAndConquer(arr, mid + 1, end);
        mergeSort(arr, start, mid, end);

    }

    public static void mergeSort(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int left = start, right = mid + 1, i = 0;
        while (left <= mid && right <= end) {
            if (arr[left] < arr[right]) {
                temp[i] = arr[left++];
            } else {
                temp[i] = arr[right++];
            }
            i++;
        }
        while (left <= mid) {
            temp[i++] = arr[left++];
        }
        while (right <= end) {
            temp[i++] = arr[right++];
        }
        for (int j = start, k = 0; k < temp.length; k++) {
            arr[j++] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        divideAndConquer(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");

        }
    }
}
