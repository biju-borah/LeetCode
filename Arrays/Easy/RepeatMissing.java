package Arrays.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatMissing {
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long totalSum = A.size() * (A.size() + 1) / 2;

        for (int i = 0; i < A.size(); i++) {
            map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);
            sum += A.get(i);
        }
        map.forEach((k, v) -> {
            if (v > 1) {
                arr.add(k);
            }
        });
        totalSum = totalSum - sum + arr.get(0);
        arr.add((int) totalSum);
        return arr;
    }

    public static void main(String[] args) {
        // int[] nums = new int[] { 3, 1, 2, 5, 3 };
        // for (int i : repeatedNumber(nums)) {
        // System.out.println(i);
        // }
    }
}
