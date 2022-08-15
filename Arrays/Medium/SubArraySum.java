package Arrays.Medium;

public class SubArraySum {

    public static int helper(int[] nums, int k, int start, int end, int count) {
        if (end == nums.length) {
            return count;
        } else if (start > end) {
            count = helper(nums, k, 0, end + 1, count);
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += nums[i];
            }
            if (sum == k) {
                count++;
            }
            count = helper(nums, k, start + 1, end, count);
        }
        return count;

    }

    public static int subarraySum(int[] nums, int k) {
        return helper(nums, k, 0, 0, 0);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        // subarraySum(arr, 2);
        System.out.println(subarraySum(arr, 3));
    }
}
