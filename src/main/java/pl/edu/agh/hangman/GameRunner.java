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
        Scanner scanner = new Scanner(System.in);
        while (myDrawer.isLost() == false & WordDisplay.isWon == false) {
            myWordChecker.checkWord(scanner.nextLine());
            if (myWordChecker.isLetterTrue) {
                myWordDisplay.next();
            }
            else {
                myDrawer.next();
            }
            System.out.println(myDrawer.getFrame());
            System.out.println(myWordDisplay.getWord());
        }
    }

    public boolean isOn() {
        return isOn;
    }
}
