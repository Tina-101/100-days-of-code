import java.util.Random;
import java.util.Scanner;

public class Band {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the band name generator!\n***********************************\n\n");

        int option = rand.nextInt(3) + 1;

        switch (option) {
            case 1:
                System.out.println("What's your last name?");
                String lastName = scan.nextLine();

                System.out.println("\n\nYour band name is: The " + lastName + "s. \n\n");
                break;

            case 2:
                System.out.println("What's your favorite place? Ex: beach, home, theater...");
                String place = scan.nextLine();

                String[] adjectives = { "infamous", "ugly", "secret", "maddening" };
                String[] complements = { "scenes", "cuts", "waves" };

                int adjective = (int) (Math.random() * adjectives.length);
                int complement = (int) (Math.random() * complements.length);

                String randomAdjective = adjectives[adjective];
                String randomComplement = complements[complement];

                System.out.println(
                        "Your band name is: " + randomAdjective + " " + place + " " + randomComplement + ". \n\n");
                break;

            case 3:
                System.out.println("What's the color of your shirt? ");
                String color = scan.nextLine();

                System.out.println("Name the first object you think of: ");
                String object = scan.nextLine();

                String[] states = { "void", "empty", "cosmic", "failing" };

                System.out.println("Your band name is: " + color + " " + states + " " + object + ".\n\n");

            default:
                break;
        }

    }
}
