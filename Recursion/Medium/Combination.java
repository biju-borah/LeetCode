import java.util.*;

public class Combination {
    public static void helper(int nums[], int k, int index, ArrayList<Integer> cur, List<List<Integer>> result) {
        if (index == k) {
            result.add(new ArrayList<>(cur));
        }

        for (int i = index; i < nums.length; i++) {
            cur.add(nums[i]);
            helper(nums, k, i + 1, cur, result);
            cur.remove(cur.size() - 1);
            // helper(nums, k, i + 1, cur, result);
        }
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        ArrayList<Integer> cur = new ArrayList<>();
        helper(nums, k, 0, cur, result);
        return result;
    }

    public static void main(String[] args) {
        for (List<Integer> list : combine(4, 2)) {
            System.err.println(list);
        }
    }
}
