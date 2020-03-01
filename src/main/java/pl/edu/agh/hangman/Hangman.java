package pl.edu.agh.hangman;

import java.io.IOException;

public class Hangman {

    public static void main(String[] args) throws IOException {
        boolean isOn = true;
        System.out.println("Type exit to exit");
        while (isOn) {
            GameRunner newGame = new GameRunner();
            newGame.Game();
            isOn = newGame.isOn();
        }
    }
}
