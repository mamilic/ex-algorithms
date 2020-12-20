package algorithms.quxes.creatures;

import java.util.*;

public class Solution {
//    private static Character[] color = new Character[]{'R', 'G', 'B'};

    public static void main(String[] args) {
        List<Character> quxes = new ArrayList<>(Arrays.asList('R', 'G', 'B', 'G', 'B'));

        transformQuxes(quxes);
    }

    private static void transformQuxes(List<Character> quxes) {
        for(int i = 0; i < quxes.size() - 1; i++) {
            if (quxes.get(i) != quxes.get(i + 1)) {
                char transformed = transformQux(quxes.get(i), quxes.get(i + 1));
                quxes.remove(i);
                quxes.remove(i + 1);

                quxes.add(0, transformed);
            }
        }
    }

    private static char transformQux(Character qux, Character qux1) {
        Set<Character> colors = new HashSet<>();
        colors.add('R');
        colors.add('G');
        colors.add('B');

        colors.remove(qux);
        colors.remove(qux1);

        return colors.stream().findFirst().get();
    }
}
