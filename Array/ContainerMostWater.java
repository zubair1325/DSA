public class ContainerMostWater {
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int start = 0;
        int end = height.length - 1;

        for (int i = 0; i < height.length - 1; i++) {
            int curr = Math.min(height[start], height[end]) * ((end - start));
            // System.out.println("start= " + height[start] + "end= " + height[end] + "end index= " + (end - start));
            // System.out.println(curr);
            maxWater = Math.max(maxWater, curr);
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }

        }
        return maxWater;

    }

    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }
}
