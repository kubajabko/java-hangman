package pl.edu.agh.hangman;

public class Drawer {

    private boolean isLost;
    private int step;
    private String frame = "";

    public Drawer() {
        this.isLost = false;
        this.step = 0;
        this.frame = "  +---+\n" +
                "  |   |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "=========";
    }

    public void next() {
        step += 1;
        changeFrame(step);
        if (step == 6) {
            System.out.println(frame + "\nGame lost!\nNext game:\n");
            isLost = true;
        }
    }

    private void changeFrame(int step) {
        if (step == 1) {
            frame = "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========";
        }
        if (step == 2) {
            frame = "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========";
        }
        if (step == 3) {
            frame = "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========";
        }
        if (step == 4) {
            frame = "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========";
        }
        if (step == 5) {
            frame = "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========";
        }
        if (step == 6) {
            frame = "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========";
        }

    }

    public String getFrame() {
        return frame;
    }

    public boolean getIsLost() {
        return isLost;
    }
}
