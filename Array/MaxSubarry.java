public class MaxSubarry {
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            maxSum = Math.max(maxSum, curr);
            if (curr < 0) {
                curr = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(nums));
    }
}
