package algorithms.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] numbers = new int[] { 3, 2, 4 };
        int target = 6;

        int[] indices = findTargetSum(numbers, target);

        System.out.println(indices[0] + " " + indices[1]);
    }

    private static int[] findTargetSum(int[] numbers, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                seen.put(numbers[i], i);
                continue;
            }

            int remaining = target - numbers[i];

            if (seen.containsKey(remaining)) {
                indices = new int[]{seen.get(remaining), i};
                break;
            } else {
                seen.put(numbers[i], i);
            }
        }

        return indices;
    }
}
