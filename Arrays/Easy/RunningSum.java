package Arrays.Easy;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        for (int i : nums) {
            System.out.println(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 3, 1, 2, 10, 1 };
        runningSum(nums);
    }
}
