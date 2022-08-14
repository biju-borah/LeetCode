package Arrays.Medium;

public class ProductArraySelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        int zeroFlag = 0;
        for (int i : nums) {
            if (i != 0) {
                product *= i;
            } else {
                zeroFlag += 1;
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (nums[i] == 0 && zeroFlag > 1) {
                result[i] = 0;
            } else if (nums[i] == 0 && zeroFlag == 1) {
                result[i] = product;
            } else if (nums[i] != 0 && zeroFlag >= 1) {
                result[i] = 0;
            } else {
                result[i] = product / nums[i];
            }
        }
        System.out.println(zeroFlag);
        for (int i : result) {
            System.out.println(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 0, 4, 0 };
        productExceptSelf(nums);
    }
}
