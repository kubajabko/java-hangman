package pl.edu.agh.hangman;

import java.awt.*;
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
        while (!myDrawer.isLost() & !myWordDisplay.getIsWon()) {
            System.out.println(myWordDisplay.getWord());
            System.out.println(myDrawer.getFrame());
            String letter = scanner.nextLine().toUpperCase().trim();
            while (letter.equals("")) {
                System.out.println("Podaj literę");
                letter = scanner.nextLine().toUpperCase().trim();
            }
            boolean check = myWordChecker.isLetterTrue(myWordDisplay.getFullWord(), letter);
            if (check) {
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
