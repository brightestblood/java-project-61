package hexlet.code;

import hexlet.code.games.*;
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
            new EvenGame().play();
        } else if (choice == 3) {
            new CalcGame().play();
        } else if (choice == 4) {
            new GcdGame().play();
        } else if (choice == 5) {
            new ProgressionGame().play();
        } else if (choice == 6) {
            new PrimeGame().play();
        }
    }
}
