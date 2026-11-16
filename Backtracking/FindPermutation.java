import java.util.ArrayList;
import java.util.List;


public class FindPermutation {
    public static void permutation(String str, String result) {
    if (str.length() == 0) {
    System.out.println(result);
    result = "";

    }
    for (int i = 0; i < str.length(); i++) {
    char ch= str.charAt(i);
    String temp = str.substring(0, i) + str.substring(i + 1);
    permutation(temp, result+ch);
    }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> sets = new ArrayList<>();
        helper(nums, sets, 0);
        return sets;

    }

    private static void helper(int nums[], List<List<Integer>> sets, int index) {
        if (index == nums.length) {
            List<Integer> current = new ArrayList<>(nums.length);
            for (int x : nums) {
                current.add(x); // Fast primitive-to-object loop caching small integers
            }
            sets.add(current);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            helper(nums, sets, index + 1);
            swap(nums, index, i);
        }
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
       // permutation("abc", "");
        int arr[] = { 1, 2 };
        List<List<Integer>> sets = permute(arr);
        for (int i = 0; i < sets.size(); i++) {// print n d array using

            List<Integer> y = sets.get(i);
            for (int z = 0; z < y.size(); z++) {
                System.out.print(y.get(z) + " ");
            }
            System.out.println();
       }
    }
}
