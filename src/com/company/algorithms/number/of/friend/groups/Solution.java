package algorithms.number.of.friend.groups;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[][] friendGroups = new int[7][2];
        friendGroups[0] = new int[]{1,2};
        friendGroups[1] = new int[]{0,5};
        friendGroups[2] = new int[]{0};
        friendGroups[3] = new int[]{6};
        friendGroups[4] = new int[]{};
        friendGroups[5] = new int[]{1};
        friendGroups[6] = new int[]{3};

        countGroups(friendGroups);
    }

    private static int countGroups(int[][] friendGroups) {
        ArrayList<ArrayList<Integer>> groups = new ArrayList<>();

        for(int i = 0; i < friendGroups.length; i++) {

            for (ArrayList list: groups) {
                if (null == list) list = new ArrayList();

//                list.addAll(i, );
            }

            if (null == groups.get(i)) {
//                groups.put(i, new ArrayList<Integer>());
            } else {

            }
        }

        return 0;
    }
}
