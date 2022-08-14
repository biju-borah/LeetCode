package Arrays.Medium;

import java.util.*;

public class Sum3 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                List<Integer> list = new ArrayList<>();
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0 && i != j && i != k && j != k) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    if (!result.contains(list)) {
                        result.add(list);
                    }
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }

        }
        // for (List<Integer> l : result) {
        // for (int x : l) {
        // System.out.println(x);
        // }
        // }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { -4, -1, -1, 0, 1, 2 };
        Sum3.threeSum(arr);
        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // ArrayList<Integer> arr = new ArrayList<>();

        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // list.add(arr);
        // ArrayList<Integer> arr2 = new ArrayList<>();
        // arr2.add(1);
        // arr2.add(2);
        // arr2.add(3);

        // if (list.contains(arr2)) {
        // System.out.println("woh");
        // }
    }
}
