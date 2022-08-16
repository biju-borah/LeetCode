package Arrays.Medium;

public class SubArraySum {

    public static int sum(int[] arr, int i, int j) {
        int sum = 0;
        if (i == 0) {
            sum = arr[j - 1] - 0;
        } else {
            sum = arr[j - 1] - arr[i - 1];
        }
        return sum;
    }

    public static int helper(int[] nums, int k, int start, int end, int count) {
        // if (end == nums.length) {
        // return count;
        // } else if (start > end) {
        // count = helper(nums, k, 0, end + 1, count);
        // } else {
        // if (sum(nums, start, end + 1) == k) {
        // count++;
        // }
        // count = helper(nums, k, start + 1, end, count);
        // }
        // return count;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k)
                    res++;
            }
        }
        return res;

    }

    public static int subarraySum(int[] nums, int k) {
        // int[] prefixSum = new int[nums.length];
        // prefixSum[0] = nums[0];
        // for (int i = 1; i < nums.length; i++) {
        // prefixSum[i] = prefixSum[i - 1] + nums[i];
        // }

        return helper(nums, k, 0, 0, 0);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { -1, -1, 1 };
        // subarraySum(arr, 2);
        System.out.println(subarraySum(arr, 0));
    }
}
