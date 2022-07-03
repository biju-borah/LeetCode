package Arrays.Easy;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int nums[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && nums[map.get(target - nums[i])] + nums[i] == target) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                System.out.println(result[0]);
                System.out.println(result[1]);
                return result;
            }
            map.put(target - nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int key = target - nums[j];
            if (key != nums[j] && map.containsKey(key) && map.containsKey(nums[map.get(key)])) {
                result[0] = j;
                result[1] = map.get(nums[map.get(key)]);
                System.out.println(result[0]);
                System.out.println(result[1]);
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1 };
        twoSum(nums, 11);
    }
}