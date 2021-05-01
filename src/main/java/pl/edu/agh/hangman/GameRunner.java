package pl.edu.agh.hangman;

import java.io.IOException;
import java.util.Scanner;

public class GameRunner {

    private boolean isOn = true;

    public GameRunner() {
    }

    public boolean isOn() {
        return isOn;
    }

    public void Game() throws IOException {
        Drawer gameDrawer = new Drawer();
        WordDisplay gameWordDisplay = new WordDisplay();
        WordChecker gameWordChecker = new WordChecker();
        Scanner userInput = new Scanner(System.in);
        while (!gameDrawer.getIsLost() & !gameWordChecker.getIsWon()) {
            System.out.println(gameWordDisplay.getRandomWordAsString());
            System.out.println(gameWordDisplay.getDisplayWordAsString());
            System.out.println(gameDrawer.getFrame());
            String letter = userInput.nextLine().toUpperCase().trim();
            if (letter.equals("EXIT")) {
                isOn = false;
                break;
            } else {
                while (letter.equals("") | letter.length() > 1) {
                    System.out.println("Podaj literę");
                    letter = userInput.nextLine().toUpperCase().trim();
                }
            }
            if (gameWordChecker.isLetterCorrect(gameWordDisplay.getRandomWordAsList(), letter)) {
                gameWordDisplay.letterAddToDisplayWord(letter);
                gameWordChecker.isWordCorrect(gameWordDisplay.getRandomWordAsString(), gameWordDisplay.getDisplayWordAsString());
            } else {
                gameDrawer.next();
            }
        }
    }
}
