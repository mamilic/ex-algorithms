package algorithms.hurricane.boat;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(calculateNeededBoats(new int[]{20, 50, 140}));
    }

    private static int calculateNeededBoats(int[] weights) {
        int neededBoats = 0;
        int weightLimit = 200;

        Arrays.sort(weights);

        for (int i = 0; i < weights.length; i++) {
            weightLimit -= weights[i];

            if (weightLimit < 0) {
                weightLimit = 200;
                weightLimit -= weights[i];
                neededBoats++;
            }

            if ((weights.length == i + 1) && weightLimit >= 0) {
                neededBoats++;
            }
        }

        return neededBoats;
    }
}
