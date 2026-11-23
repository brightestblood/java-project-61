package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Round;
import java.util.Random;

public class CalcGame implements Game {
    private static final int MAX_NUMBER = 100;
    private static final String[] OPERATORS = {"+", "-", "*"};
    private final Random random = new Random();

    public String getDescription() {
        return "What is the result of the expression?";
    }

    public Round generateRound() {
        int a = random.nextInt(MAX_NUMBER) + 1;
        int b = random.nextInt(MAX_NUMBER) + 1;
        String operator = OPERATORS[random.nextInt(OPERATORS.length)];

        int result;
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                throw new RuntimeException("Unknown operator " + operator);
        }

        String question = a + " " + operator + " " + b;
        return new Round(question, String.valueOf(result));
    }
}
