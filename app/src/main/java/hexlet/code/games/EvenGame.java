package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Round;
import java.util.Random;

public class EvenGame implements Game {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();

    @Override
    public String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public Round generateRound() {
        int number = random.nextInt(MAX_NUMBER) + 1;
        String correctAnswer = isEven(number) ? "yes" : "no";
        return new Round(String.valueOf(number), correctAnswer);
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}
