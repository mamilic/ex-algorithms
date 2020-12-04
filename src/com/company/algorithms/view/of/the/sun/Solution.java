package algorithms.view.of.the.sun;

public class Solution {

    public static void main(String[] args) {
        System.out.println(findSettingSunView(new int[]{3, 7, 8, 3, 6, 1}));
    }

    private static int findSettingSunView(int[] buildings) {
        int sunViewCount = 0;
        int tallest = buildings[buildings.length - 1];

        if (buildings.length == 0) return sunViewCount;

        sunViewCount = checkClosestToSun(buildings);

        for (int i = buildings.length - 2; i >= 0; i--) {

            if (buildings[i] > tallest) {
                tallest = buildings[i];
                sunViewCount++;
            }
        }

        return sunViewCount;
    }

    private static int checkClosestToSun(int[] sunViewCount) {
        return 1;
    }
}
