package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.List;

public class WordConverter {


    private ArrayList<Character> listOfLetters = new ArrayList<Character>();

    public ArrayList<Character> getListOfLetters() {
        return listOfLetters;
    }

    public List<Character> wordToLetters (String word){

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

}
