public class MissingRepeated {
    public static void ArrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] findMissingAndRepeatedValues(int[][] grid) {
        int temp[] = new int[(grid.length * grid[0].length)+1];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                temp[grid[i][j]]++;
            }
        }

        int ans[] = new int[2];
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] == 2) {
                ans[0] = i ;
            }
            if (temp[i] == 0) {
                ans[1] = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int grid[][] = { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } };
        ArrayPrint(findMissingAndRepeatedValues(grid));

    }
}
