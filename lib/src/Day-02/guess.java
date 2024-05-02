import java.util.Scanner;
import java.util.Random;

public class guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int counter = 1;
        int number = random.nextInt(10);

        System.out.println("Guess a number between 0 and 10: ");
        int guess = scan.nextInt();

        while (guess != number) {
            System.out.println("Wrong answer :(  ");
            if (guess > number) {
                System.out.println("Guess lower:");
            } else if (guess < number) {
                System.out.println("Guess higher:");
            }
            guess = scan.nextInt();
            counter++;
        }

        if (number == guess) {
            System.out.println("Correct! The number was " + number + ".");
            System.out.println("You tried to guess the number " + counter + " times.");

        }
    }
}
