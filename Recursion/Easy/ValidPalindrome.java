package Recursion.Easy;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        boolean isPal = true;
        String s2 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < s2.length() / 2; i++) {
            if (s2.charAt(i) != s2.charAt(s2.length() - i - 1)) {
                isPal = false;
                break;
            }
        }
        return isPal;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}
