package Arrays.Easy;

public class PivotIndex {

    public static int pivotIndex(int[] nums) {
        int sumT = 0;
        for (int i : nums) {
            sumT += i;
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                sum1 += nums[i - 1];

            }
            sum2 = sumT - sum1 - nums[i];
            if (sum1 == sum2) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(nums));
    }
}
