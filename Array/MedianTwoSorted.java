public class MedianTwoSorted {
    public static void ArrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int temp[] = new int[nums1.length + nums2.length];
        int a = 0;
        int b = 0;
        int i = 0;
        while (a < nums1.length && b < nums2.length) {
            if (nums1[a] < nums2[b]) {
                temp[i] = nums1[a++];
            } else {
                temp[i] = nums2[b++];
            }
            i++;
        }

        while (a < nums1.length) {
            temp[i++] = nums1[a++];
        }
        while (b < nums2.length) {
            temp[i++] = nums2[b++];
        }

        if ((temp.length) % 2 == 0) {
            float left = temp[(temp.length - 1) / 2];
            float right = temp[(temp.length) / 2];
            return (left + right) / 2;
        } else {
            return (temp[(temp.length) / 2]);
        }
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 3 };
        int nums2[] = { 2, };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
