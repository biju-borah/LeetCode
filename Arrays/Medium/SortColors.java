package Arrays.Medium;

public class SortColors {
    public static int findMax(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        return max;
    }
    public static void sortColors(int[] nums) {
        int max = findMax(nums);
        int[] count = new int[max + 1];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[index++] = i;
                count[i]--;
            }        
        }

    }

    public static void main(String[] args) {

    }
}
