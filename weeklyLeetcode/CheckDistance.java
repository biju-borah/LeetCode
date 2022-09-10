package weeklyLeetcode;
import java.util.HashMap;

public class CheckDistance {
    public static int helper(HashMap<Character, Integer> hashMap, int i, Character c) {
        if (hashMap.containsKey(c)) {
            return i - hashMap.get(c) - 1;
        } else {
            return i;
        }
    }

    public static boolean checkDistances(String s, int[] distance) {
        int pivot = 97;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int val = helper(hashMap, i, s.charAt(i));
            hashMap.put(s.charAt(i), val);
        }
        for (int i = 0; i < distance.length; i++) {
            char t = (char) (pivot + i);
            if (hashMap.containsKey(t)) {
                if (distance[i] != hashMap.get(t)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] distance = { 1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        System.out.println(checkDistances("abaccb", distance));
    }
}
