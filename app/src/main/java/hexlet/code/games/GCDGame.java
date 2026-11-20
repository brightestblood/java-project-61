package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Round;
import java.util.Random;

public class GCDGame implements Game {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();

    public String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    public Round generateRound() {
        int a = random.nextInt(MAX_NUMBER) + 1;
        int b = random.nextInt(MAX_NUMBER) + 1;
        int correctAnswer = GCD(a, b);
        String question = a + " " + b;
        return new Round(question, String.valueOf(correctAnswer));

    }

    private int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}