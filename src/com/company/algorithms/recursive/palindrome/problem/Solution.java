package algorithms.recursive.palindrome.problem;

public class Solution {

    public static void main(String[] args) {
        System.out.println(checkPolindrome("marama", 0));
    }

    private static boolean checkPolindrome(String string, int i) {
        if (i == string.length() / 2) return true;

        if (string.charAt(i) != string.charAt(string.length() - 1)) return false;

        return checkPolindrome(string.substring(i + 1, string.length() - 1), i + 1);
    }
}