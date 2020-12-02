package algorithms.recursive.sum;

public class Solution {

    public static void main(String[] args) {
        sum(5);
    }

    private static int sum(int i) {
        if (i == 0) return 0;

        return sum(i - 1) ;
    }
}
