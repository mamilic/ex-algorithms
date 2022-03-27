package algorithms.wordie.checker;

import java.util.HashMap;
import java.util.Map;

public class WordieChecker {
    public static void main(String[] args) {
        int guessWordCount = guessWord("jewel");

    }

    private static int guessWord(String guessWord) {
        String wordToGuess = "siege";

        int guessedCount = 0;
        int missMatchCount = 0;

        Map<Character, Integer> characters = new HashMap<>();
        characters.put('s', 1);
        characters.put('i', 1);
        characters.put('e', 2);
        characters.put('g', 1);

        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guessWord.charAt(i)) {
                guessedCount++;
                characters.put(wordToGuess.charAt(i), characters.get(wordToGuess.charAt(i)) - 1);
            } else {
                if (characters.get(guessWord.charAt(i)) != null && characters.get(guessWord.charAt(i)) > 0) {
                    characters.put(wordToGuess.charAt(i), characters.get(wordToGuess.charAt(i)) - 1);
                    missMatchCount++;
                }
            }
        }

        System.out.println("Guess Count: " + guessedCount);
        System.out.println("Missmatch Count: " + missMatchCount);

        return guessedCount;
    }
}
