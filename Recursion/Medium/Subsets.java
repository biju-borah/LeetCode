
import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void helper(int nums[], int i, ArrayList<Integer> cur, List<List<Integer>> ans) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[i]);
        helper(nums, i + 1, cur, ans);
        cur.remove(cur.size() - 1);
        helper(nums, i + 1, cur, ans);

    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        helper(nums, 0, cur, list);
        return list;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3 };
        for (List<Integer> i : subsets(nums)) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
