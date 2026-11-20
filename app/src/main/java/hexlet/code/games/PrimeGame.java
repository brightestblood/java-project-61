package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Round;
import java.util.Random;

public class PrimeGame implements Game {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();

    public String getDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public Round generateRound() {
        int number = random.nextInt(MAX_NUMBER) + 1;
        String correctAnswer = isPrime(number) ? "yes" : "no";
        return new Round(String.valueOf(number), correctAnswer);
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
