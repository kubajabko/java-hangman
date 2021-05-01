package pl.edu.agh.hangman;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordDisplay {

    WordConverter myWordConverter = new WordConverter();
    RandomWordGenerator myRandomWordGenerator = new RandomWordGenerator();
    private String displayedWord = "";
    private boolean isWon = false;
    private final List<Character> fullWord;
    private final List<Character> tempWord;
    String word;

    public WordDisplay() throws IOException {
        this.word = myRandomWordGenerator.getRandomWord(myRandomWordGenerator.importWords());
        this.fullWord = myWordConverter.wordToLetters(word);
        this.displayedWord = myWordConverter.listToString(wordToLettersToX(fullWord));
        this.tempWord = wordToLettersToX(fullWord);
    }

    public boolean getIsWon() {
        return isWon;
    }

    public String getWord() {
        return displayedWord;
    }

    public List<Character> getFullWord() {
        return fullWord;
    }

    public List<Character> wordToLettersToX(List<Character> wordToLettersToX) {
        List<Character> word = new ArrayList<>();
        for (int i = 0; i < wordToLettersToX.size(); i++) {
            word.add(i, '_');
        }
        return word;
    }

    public void next(String letter) {
        int counter = 0;
        for (Character c : fullWord) {
            if (c == letter.charAt(0)) {
                tempWord.set(counter, letter.charAt(0));
            }
            counter = counter  + 1;
        }
        displayedWord = myWordConverter.listToString(tempWord);
        if (displayedWord.equals(word)) {
            System.out.println("Game won!\nNext game:");
            isWon = true;
        }
    }

}
