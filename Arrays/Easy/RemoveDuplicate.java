package Arrays.Easy;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[nums.length - 1]) {
                return ++x;
            }
            if (nums[i] != nums[x]) {
                nums[x + 1] = nums[i];
                x++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return ++x;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(nums));
    }
}
