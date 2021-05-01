package pl.edu.agh.hangman;

import java.util.List;

public class WordChecker {

    public WordChecker() {

    }

    public boolean isLetterTrue(List<Character> fullWord, String letter) {
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
