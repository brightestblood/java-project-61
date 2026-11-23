package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import java.util.Random;

public class CalcGame implements Game {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;
    private static final String[] OPERATORS = {"+", "-", "*"};
    private final Random random = new Random();

    @Override
    public void play() {
        String rule = "What is the result of the expression?";
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int a = random.nextInt(MAX_NUMBER) + 1;
            int b = random.nextInt(MAX_NUMBER) + 1;
            String operator = OPERATORS[random.nextInt(OPERATORS.length)];

            roundsData[i][0] = a + " " + operator + " " + b;
            roundsData[i][1] = String.valueOf(calculate(a, b, operator));
        }

        Engine.play(rule, roundsData);
    }

    private int calculate(int a, int b, String operator) {
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
    }
}
