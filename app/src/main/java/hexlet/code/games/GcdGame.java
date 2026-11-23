package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import java.util.Random;

public class GcdGame implements Game {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();

    @Override
    public void play() {
        String rule = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int a = random.nextInt(MAX_NUMBER) + 1;
            int b = random.nextInt(MAX_NUMBER) + 1;

            roundsData[i][0] = a + " " + b;
            roundsData[i][1] = String.valueOf(gcd(a, b));
        }

        Engine.play(rule, roundsData);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
