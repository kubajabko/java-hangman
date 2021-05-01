package pl.edu.agh.hangman;

import java.io.IOException;
import java.util.List;

public class WordDisplay {

    WordConverter gameWordConverter = new WordConverter();
    RandomWordGenerator gameRandomWordGenerator = new RandomWordGenerator();

    private String displayWordAsString;
    private final String randomWordAsString;
    private final List<Character> randomWordAsList;
    private List<Character> guessWordAsList;

    public WordDisplay() throws IOException {
        this.randomWordAsString = gameRandomWordGenerator.getRandomWord(gameRandomWordGenerator.importWords());
        this.randomWordAsList = gameWordConverter.stringToList(randomWordAsString);
        this.displayWordAsString = gameWordConverter.listToString(gameWordConverter.lettersToBlanks(randomWordAsList));
        this.guessWordAsList = gameWordConverter.lettersToBlanks(randomWordAsList);
    }

    public String getDisplayWordAsString() {
        return displayWordAsString;
    }

    public String getRandomWordAsString() {
        return randomWordAsString;
    }

    public List<Character> getRandomWordAsList() {
        return randomWordAsList;
    }

    public void letterAddToDisplayWord(String letter) {
        int counter = 0;
        for (Character c : randomWordAsList) {
            if (c == letter.charAt(0)) {
                guessWordAsList.set(counter, letter.charAt(0));
            }
            counter = counter + 1;
        }
        displayWordAsString = gameWordConverter.listToString(guessWordAsList);
    }
}
