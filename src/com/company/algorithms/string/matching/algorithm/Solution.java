package algorithms.string.matching.algorithm;

public class Solution {

    public static void main(String[] args) {
        System.out.println(findString("marko", "rk"));
    }

    private static boolean findString(String source, String pattern) {
        int matchCount = 0;

        for (int i = 0; i < source.length(); i++) {

            if (source.charAt(i) == pattern.charAt(matchCount)) {
                matchCount++;
            } else {
                matchCount = 0;
            }

            if (matchCount == pattern.length()) return true;
        }
        return false;
    }
}
