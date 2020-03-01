package pl.edu.agh.hangman;

public class Hangman {

    public static void main(String[] args) {
        boolean isOn = true;
        System.out.println("Type exit to exit");
        while (isOn) {
            GameRunner newGame = new GameRunner();
            newGame.Game();
            isOn = newGame.isOn();
        }
    }
}
