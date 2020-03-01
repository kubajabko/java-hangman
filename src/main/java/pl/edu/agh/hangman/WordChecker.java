package pl.edu.agh.hangman;

import java.util.List;

public class WordChecker {

    private String letter = "";

    public WordChecker() {

    }

    public void checkLetter(String letter) {
        this.letter = letter;
    }

    public boolean isLetterTrue(List<Character> fullWord) {
        boolean isTrue = false;
        for (Character c : fullWord) {
            if (c == letter.charAt(0)) {
                isTrue = true;
                break;
            }
        }

        return isTrue;
    }

}
