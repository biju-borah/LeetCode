package Arrays.Medium;

import java.util.HashMap;

public class SubArraySum {

    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> hMap = new HashMap<>();
        hMap.put(0, 1);
        int curSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            System.out.println(curSum - k);
            if (hMap.containsKey(curSum - k)) {
                count += hMap.get(curSum - k);
            }
            hMap.put(curSum, hMap.getOrDefault(curSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, -1, 0 };
        // subarraySum(arr, 2);
        System.out.println(subarraySum(arr, 0));
    }
}
