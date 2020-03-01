package pl.edu.agh.hangman;

import java.util.Scanner;

public class GameRunner {

    private boolean isOn = true;

    public GameRunner() {

    }

    public void Game() {
        Drawer myDrawer = new Drawer();
        WordDisplay myWordDisplay = new WordDisplay();
        WordChecker myWordChecker = new WordChecker();
        System.out.println(myDrawer.getFrame());
        System.out.println(myWordDisplay.getWord());
        Scanner scanner = new Scanner(System.in);
        while (myDrawer.isLost() == false & WordDisplay.isWon == false) {
            String letter = scanner.nextLine();
            myWordChecker.checkLetter(letter);
            if (myWordChecker.isLetterTrue(myWordDisplay.getFullWord)) {
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
