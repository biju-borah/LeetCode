import java.util.*;

public class CombinationSum2 {
    public static void helper(int n, int index, int arr[], ArrayList<Integer> cur, List<List<Integer>> result) {
        if (n == 0) {
            result.add(new ArrayList<>(cur));
            System.out.println(cur);
            return;
        }
        if (n < 0)
            return;

        int prev = -1;
        for (int i = index; i < arr.length; i++) {
            if (arr[i] == prev)
                continue;
            if (n - arr[i] >= 0) {
                cur.add(arr[i]);
                helper(n - arr[i], i + 1, arr, cur, result);
                cur.remove(cur.size() - 1);
            }
            prev = arr[i];
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<Integer> cur = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        helper(target, 0, candidates, cur, result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
        // helper(7, 0, arr, cur, result);
        for (List<Integer> i : combinationSum2(arr, 8)) {
            System.out.println(i);
        }
    }
}
