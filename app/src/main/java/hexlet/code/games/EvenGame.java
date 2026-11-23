package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import java.util.Random;

public class EvenGame implements Game {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();

    @Override
    public void play() {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = random.nextInt(MAX_NUMBER) + 1;
            roundsData[i][0] = String.valueOf(number);
            roundsData[i][1] = isEven(number) ? "yes" : "no";
        }

        Engine.play(rule, roundsData);
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}
