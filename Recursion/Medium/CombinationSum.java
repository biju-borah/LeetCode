import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void helper(int n, int index, int arr[], ArrayList<Integer> cur, List<List<Integer>> result) {
        if (n == 0) {
            result.add(new ArrayList<>(cur));
            System.out.println(cur);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (n - arr[i] >= 0) {
                cur.add(arr[i]);
                helper(n - arr[i], i, arr, cur, result);
                cur.remove(cur.size() - 1);
            }
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> cur = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(target, 0, candidates, cur, result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7 };
        // helper(7, 0, arr, cur, result);
        combinationSum(arr, 7);
        for (List<Integer> i : combinationSum(arr, 7)) {
            System.out.println(i);
        }
    }
}
