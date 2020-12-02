package algorithms.recursive.print.reverse.string;

public class Solution {

    public static void main(String[] args) {
        printReverse("Marko");
    }

    private static void printReverse(String string) {
        if (string.length() == 1) {
            System.out.println(string.charAt(string.length() - 1));
        } else {
            System.out.println(string.charAt(string.length() - 1));
            printReverse(string.substring(0, string.length() - 1));
        }
    }


}
