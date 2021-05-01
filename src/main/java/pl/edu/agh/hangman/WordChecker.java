package pl.edu.agh.hangman;

import java.util.List;

public class WordChecker {

    public WordChecker() {}

    private boolean isWon = false;

    public boolean getIsWon() {
        return isWon;
    }

    public boolean isLetterCorrect(List<Character> fullWord, String letter) {
        boolean isTrue = false;
        for (Character c : fullWord) {
            if (c == letter.charAt(0)) {
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }

    public void isWordCorrect(String randomWord, String guessedWord) {
        if (randomWord.equals(guessedWord)) {
            System.out.println("\nGame won!\nNext game:\n");
            isWon = true;
        }
    }

}
