package Arrays.Medium;

public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int maxsum = 0;
        int cursum = 0;
        boolean flag = true;
        int minsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cursum = cursum + nums[i];
            if (cursum > maxsum) {
                maxsum = cursum;
                flag = true;
            }
            if (cursum > minsum)
                minsum = cursum;
            if (cursum < 0)
                cursum = 0;

        }
        return flag ? maxsum : minsum;
    }

    public static void main(String[] args) {

    }
}
