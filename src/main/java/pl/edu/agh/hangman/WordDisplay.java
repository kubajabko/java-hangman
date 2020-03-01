package pl.edu.agh.hangman;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordDisplay {

    WordConverter myWordConverter = new WordConverter();
    RandomWordGenerator myRandomWordGenerator = new RandomWordGenerator();
    private String displayedWord = "";

    public boolean getIsWon() {
        return isWon;
    }

    private boolean isWon = false;
    private List <Character> fullWord = new ArrayList<>();
    private List <Character> tempWord = new ArrayList<>();

    public String getWord() {
        return displayedWord;
    }

    public List<Character> getFullWord() {
        return fullWord;
    }

    public WordDisplay() throws IOException {
        this.fullWord = myWordConverter.wordToLetters(myRandomWordGenerator.getRandomWord(myRandomWordGenerator.importWords()));
        this.displayedWord = myWordConverter.listToString(wordToLettersToX(fullWord));
        this.tempWord = wordToLettersToX(fullWord);

    }

    public List<Character> wordToLettersToX (List<Character> wordToLettersToX){
        for (int i = 0; i < wordToLettersToX.size(); i++) {
            wordToLettersToX.set(i, '_');
        }
        return wordToLettersToX;
    }

    public void next (String letter){
        for (Character c : fullWord){
            if (c==letter.charAt(0)){
                tempWord.set(fullWord.indexOf(c), letter.charAt(0));
            }
        }
        displayedWord = myWordConverter.listToString(tempWord);
        if (tempWord == fullWord) {
            isWon = true;
        }
    }

}
