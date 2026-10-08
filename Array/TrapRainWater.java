public class TrapRainWater {
    public static void ArrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int trap(int[] height) {
        int leftMax[] = new int[height.length];
        int maxWater = 0;
        leftMax[0] = height[0];
        int rightMax[] = new int[height.length];
        rightMax[rightMax.length - 1] = height[height.length - 1];

        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        ArrayPrint(leftMax);
        ArrayPrint(rightMax);
        for (int i = 0; i < height.length; i++) {
           // System.out.println((Math.min(leftMax[i], rightMax[i])) - height[i]);
            maxWater += (Math.min(leftMax[i], rightMax[i])) - height[i];
        }
        return maxWater;

    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(height));
    }
}
