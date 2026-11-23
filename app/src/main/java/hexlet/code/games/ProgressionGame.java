package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import java.util.Random;

public class ProgressionGame implements Game {
    private static final int ROUNDS_COUNT = 3;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MAX_START = 100;
    private static final int MAX_STEP = 10;

    private final Random random = new Random();

    @Override
    public void play() {
        String rule = "What number is missing in the progression?";
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int start = random.nextInt(MAX_START) + 1;
            int step = random.nextInt(MAX_STEP) + 1;
            int hiddenIndex = random.nextInt(length);

            String[] progression = generateProgression(start, step, length);

            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            roundsData[i][0] = String.join(" ", progression);
            roundsData[i][1] = correctAnswer;
        }

        Engine.play(rule, roundsData);
    }

    private String[] generateProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }
}
