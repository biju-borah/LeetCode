import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationSum {
    public static void helper(int n, int arr[], ArrayList<Integer> cur, List<List<Integer>> result) {
        if (n == 0) {
            System.out.println(cur);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (n - arr[i] >= 0) {
                cur.add(arr[i]);
                helper(n - arr[i], arr, cur, result);
                cur.remove(cur.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5 };
        ArrayList<Integer> cur = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(8, arr, cur, result);
    }
}
