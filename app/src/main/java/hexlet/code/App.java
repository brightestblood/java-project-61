package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        if (choice == 1) {
            Cli.greetUserName();
        } else if (choice == 2) {
            Engine.play(new EvenGame());
        } else if (choice == 3) {
            Engine.play(new CalcGame());
        } else if (choice == 4) {
            Engine.play(new GCDGame());
        } else if (choice == 5) {
            Engine.play(new ProgressionGame());
        } else if (choice == 6) {
            Engine.play(new PrimeGame());
        }
    }
}
