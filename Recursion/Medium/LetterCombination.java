import java.util.*;

public class LetterCombination {
    public static void helper(String[] key, int l, String digits, HashMap<Character, String> hashMap) {
        if (l == digits.length()) {
            System.out.print(key[l]);
            System.out.println();
            return;
        }
        for (int i = 0; i < digits.length(); i++) {
            String keypad = hashMap.get(digits.charAt(i));
            for (int j = 0; j < keypad.length(); j++) {

            }
        }
    }

    public static List<String> letterCombinations(String digits) {
        HashMap<Character, String> hashMap = new HashMap<>();
        hashMap.put('2', "abc");
        hashMap.put('3', "def");
        hashMap.put('4', "ghi");
        hashMap.put('5', "jkl");
        hashMap.put('6', "mno");
        hashMap.put('7', "pqrs");
        hashMap.put('8', "tuv");
        hashMap.put('9', "wxyz");
        String[] key = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        helper(key, 0, digits, hashMap);
        List<String> list = new ArrayList<>();
        return list;
    }

    public static void main(String[] args) {
        letterCombinations("23");
    }
}
