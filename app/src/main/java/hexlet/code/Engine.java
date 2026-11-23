package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void play(String gameRule, String[][] roundsData) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameRule);

        for (String[] round : roundsData) {
            String question = round[0];
            String correctAnswer = round[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println(
                        "'"
                                + userAnswer
                                + "' is wrong answer ;(. Correct answer was '"
                                + correctAnswer
                                + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
