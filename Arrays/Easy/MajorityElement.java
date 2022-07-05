package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int k = nums.length / 2;
        int index = 0;
        int element = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> mapElement : map.entrySet()) {
            int key = mapElement.getKey();
            int value = mapElement.getValue();
            if (value > index && value > k) {
                index = value;
                element = key;
            }

            System.out.println(key + " : " + value);
        }
        return element;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
    }
}
