
public class TwoSum {
    public static void ArrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] BrutForceSolution(int nums[], int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1 };

    }

    public static void main(String[] args) {
        int nums[] = { 2,7,11,15};
        int target = 9;
        ArrayPrint(BrutForceSolution(nums, target));

    }
}
