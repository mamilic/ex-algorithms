package algorithms.anagram;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(checkIfAnagram("listen", "silent"));
    }

    private static boolean checkIfAnagram(String source, String target) {
        char[] sourceArray = source.toCharArray();
        char[] targetArray = target.toCharArray();
        Arrays.sort(sourceArray);
        Arrays.sort(targetArray);

        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] != targetArray[i]) return false;
        }
        return true;
    }

}
