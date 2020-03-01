package pl.edu.agh.hangman;

import java.io.IOException;
import java.util.Scanner;

public class GameRunner {

    private boolean isOn = true;

    public GameRunner() {

    }

    public void Game() throws IOException {
        Drawer myDrawer = new Drawer();
        WordDisplay myWordDisplay = new WordDisplay();
        WordChecker myWordChecker = new WordChecker();
        Scanner scanner = new Scanner(System.in);
        while (myDrawer.isLost() == false & myWordDisplay.getIsWon() == false) {
            System.out.println(myDrawer.getFrame());
            System.out.println(myWordDisplay.getWord());
            String letter = scanner.nextLine().toUpperCase().trim();
            myWordChecker.checkLetter(letter);
            if (myWordChecker.isLetterTrue(myWordDisplay.getFullWord())) {
                myWordDisplay.next(letter);
            }
            else {
                myDrawer.next();
            }
        }
    }

    public boolean isOn() {
        return isOn;
    }
}
