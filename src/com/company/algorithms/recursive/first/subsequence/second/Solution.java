package algorithms.recursive.first.subsequence.second;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isSubsequence("ble".toCharArray(), "tableae".toCharArray(), 0, 0));
    }

    private static boolean isSubsequence(char[] str1, char[] str2, int i, int j) {
        if (i == str1.length - 1) return true;
        if (j == str2.length - 1) return false;

        if(str1[i] == str2[j]) {
            return isSubsequence(str1, str2, i+1, j+1);
        } else {
            return isSubsequence(str1, str2, i, j + 1);
        }

    }
}
