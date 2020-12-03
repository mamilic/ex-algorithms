package algorithms.recursive.palindrome.problem;

public class Solution {

    public static void main(String[] args) {
        System.out.println(checkPolindrome("able was i ere i saw elba"));
    }

    private static boolean checkPolindrome(String string) {
        if (string.length() == 1) return true;
        if (string.length() == 2) return string.charAt(0) == string.charAt(1);

        if (string.charAt(0) != string.charAt(string.length() - 1)) return false;

        return checkPolindrome(string.substring(1, string.length() - 1));
    }
}