import java.util.*;

public class LetterCombination {
    public static void helper(String[] key, int l, String digits, HashMap<Character, String> hashMap, String res,
            List<String> list) {
        if (l == digits.length()) {
            System.out.println(res);
            list.add(res);
            return;
        }
        String keypad = hashMap.get(digits.charAt(l));
        for (int j = 0; j < keypad.length(); j++) {
            char c = keypad.charAt(j);
            helper(key, l + 1, digits, hashMap, res + c, list);
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
        List<String> list = new ArrayList<>();
        if (digits.isEmpty())
            return list;
        helper(key, 0, digits, hashMap, "", list);
        return list;
    }

    public static void main(String[] args) {
        letterCombinations("");
    }
}
