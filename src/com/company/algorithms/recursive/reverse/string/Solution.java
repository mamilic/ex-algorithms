package algorithms.recursive.reverse.string;

public class Solution {

    public static void main(String[] args) {
        char[] charArray = "marko".toCharArray();
        recursiveReverse(charArray, 0);
        System.out.println(String.valueOf(charArray));
    }

    private static void recursiveReverse(char[] charArray, int i) {
        int n = charArray.length;
        if (i == n / 2) return;

        swap(charArray, i, n - i - 1);
        recursiveReverse(charArray, i + 1);
    }

    private static void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}
