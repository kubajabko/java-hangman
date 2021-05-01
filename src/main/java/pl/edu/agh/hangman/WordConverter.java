package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.List;

public class WordConverter {

    public WordConverter() {}

    private final ArrayList<Character> listOfLetters = new ArrayList<>();

    public List<Character> stringToList(String word){

        for (char c : word.toCharArray()) {
            listOfLetters.add(c);
        }
        return listOfLetters;
    }

    public String listToString (List<Character> charList){

        StringBuilder sb = new StringBuilder();
        for (Character s : charList)
        {
            sb.append(s);
        }
        return sb.toString();
    }

    public List<Character> lettersToBlanks(List<Character> inputWordWithLetter) {
        List<Character> outputWordWithBlanks = new ArrayList<>();
        for (int i = 0; i < inputWordWithLetter.size(); i++) {
            outputWordWithBlanks.add(i, '_');
        }
        return outputWordWithBlanks;
    }
}
