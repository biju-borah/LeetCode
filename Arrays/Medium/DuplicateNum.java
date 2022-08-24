package Arrays.Medium;

import java.util.Arrays;

public class DuplicateNum {
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                ans = nums[i];
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 3, 1, 3, 4, 2 };
        System.out.println(findDuplicate(nums));
    }
}
