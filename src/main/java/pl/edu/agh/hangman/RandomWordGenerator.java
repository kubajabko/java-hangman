package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWordGenerator {

    public List<String> importWords () throws IOException {
        File words = new File("src/main/resources/slowa.txt");
        BufferedReader reader = Files.newBufferedReader(words.toPath());
        List<String> wordsList = new ArrayList<>();
        String word = null;
        while ((word = reader.readLine()) != null) {
            wordsList.add(word.toUpperCase());
        }
        reader.close();
        return wordsList;
    }

    public String getRandomWord(List<String> wordsList){

        Random random = new Random();
        String theWord = wordsList.get(random.nextInt(wordsList.size()));
        return theWord;
    }
}
