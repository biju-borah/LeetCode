import java.util.*;

public class CombinationSum3 {
    public static void helper(int k, int n, int index, ArrayList<Integer> cur, List<List<Integer>> res, int sum) {
        if (cur.size() == k) {
            if (sum != n)
                return;
            System.out.println(cur);
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = index; i < 10; i++) {
            sum += i;
            if (sum > n) {
                return;
            }
            cur.add(i);
            helper(k, n, i + 1, cur, res, sum);
            cur.remove(cur.size() - 1);
            sum -= i;

        }
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<Integer> cur = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        helper(k, n, 1, cur, res, 0);
        System.out.println(res.size());
        return res;
    }

    public static void main(String[] args) {
        combinationSum3(4, 1);
    }
}
