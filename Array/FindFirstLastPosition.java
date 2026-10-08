public class FindFirstLastPosition {
    public static void ArrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // liner time complexity if all the number on the array are same
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int first = -1;
        int last = -1;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                System.out.println("entred");
                first = last = mid;
                while (first > 0 && nums[first - 1] == target) {
                    first--;

                }
                while (last < nums.length - 1 && nums[last + 1] == target) {
                    last++;
                }
                return new int[] { first, last };

            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[] { first, last };

    }

    // optimized version time complexity log(N)
    public static int[] searchRange4(int[] nums, int target) {
        int[] result = { -1, -1 };

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result[1] = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        ArrayPrint(searchRange4(nums, 8));

    }
}
