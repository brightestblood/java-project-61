package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Round;
import java.util.Random;

public class ProgressionGame implements Game {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MAX_START = 100;
    private static final int MAX_STEP = 10;

    private final Random random = new Random();

    public String getDescription() {
        return "What number is missing in the progression?";
    }

    public Round generateRound() {
        int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
        int start = random.nextInt(MAX_START) + 1;
        int step = random.nextInt(MAX_STEP) + 1;
        int hiddenIndex = random.nextInt(length);

        String[] elements = new String[length];
        for (int i = 0; i < length; i++) {
            int currentElement = start + i * step;
            if (i == hiddenIndex) {
                elements[i] = "..";
            } else {
                elements[i] = String.valueOf(currentElement);
            }
        }

        String question = String.join(" ", elements);
        int correctAnswer = start + hiddenIndex * step;

        return new Round(question, String.valueOf(correctAnswer));
    }
}
