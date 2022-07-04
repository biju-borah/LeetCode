package Arrays.Easy;

public class MoveZeros {

    public static void moveZeroes(int[] nums) {
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[pointer];
                nums[pointer] = temp;
                pointer++;

            }
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 0, 0, 1 };
        moveZeroes(nums);
    }
}
