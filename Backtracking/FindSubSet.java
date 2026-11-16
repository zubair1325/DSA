import java.util.ArrayList;
import java.util.List;

public class FindSubSet {
    // public static void subsets(String s, String set, int index) {
    // if (index == s.length()) {
    // System.out.println(set);
    // return;
    // }
    // subsets(s, set + s.charAt(index), index + 1);
    // subsets(s, set, index + 1);
    // }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sets = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        helper(nums, sets, 0, arrayList);
        return sets;
    }

    public static List<List<Integer>> helper(int nums[], List<List<Integer>> sets, int index,
            ArrayList<Integer> arrayList) {
        if (index == nums.length) {
            sets.add(new ArrayList<>(arrayList));
            return sets;
        }

        arrayList.add(nums[index]);
        helper(nums, sets, index + 1, arrayList);
        arrayList.removeLast();
        helper(nums, sets, index + 1, arrayList);
        return sets;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        List<List<Integer>> sets = subsets(arr);

    }
}
