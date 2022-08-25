package Arrays.Medium;

import java.util.*;

public class MajorityElement2 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length / 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer integer : nums) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
            if (map.get(integer) > n && !result.contains(integer)) {
                result.add(integer);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = new int[] { 1, 2 };
        for (int i : majorityElement(num)) {
            System.out.println(i);
        }
    }
}
