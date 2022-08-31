
import java.util.ArrayList;
import java.util.List;

public class PermuteArr {
    public static void swap(List<Integer> cur, int l, int i) {
        int temp = cur.get(i);
        cur.set(i, cur.get(l));
        cur.set(l, temp);
    }

    public static void helper(int[] nums, int l, int r, List<Integer> cur, List<List<Integer>> result) {
        if (l == r) {
            result.add(new ArrayList<>(cur));
        }
        for (int i = l; l <= r; i++) {
            swap(cur, l, i);
            helper(nums, l + 1, r, cur, result);
            swap(cur, l, i);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        for (Integer integer : nums) {
            cur.add(integer);
        }
        helper(nums, 0, nums.length, cur, result);
        return result;
    }

    public static void main(String[] args) {

    }
}
