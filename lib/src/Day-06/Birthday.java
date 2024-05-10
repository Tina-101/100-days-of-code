import java.util.Scanner;
import java.time.LocalDate;

public class Birthday {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Scanner scan = new Scanner(System.in);

        int currentDay = localDate.getDayOfMonth();
        int currentMonth = localDate.getMonthValue();
        int currentYear = localDate.getYear();

        System.out.println("Let's calculate your age!\nwhat day were you born on? ");
        int day = scan.nextInt();

        System.out.println("\nalright! now what month were you born in?");
        int month = scan.nextInt();

        System.out.println("\nfinal question. what year?");
        int year = scan.nextInt();

        int age = currentYear - year;

        if (month < currentMonth) {
            System.out.println("\nyou are " + age + " years old");
        } else if (month == currentMonth) {
            if (day <= currentDay) {
                System.out.println("\nyou are " + age + " years old");
            }
            if (day > currentDay) {
                System.out.println("\nyou are " + (age - 1) + " years old");
            }
        } else if (month > currentMonth) {
            System.out.println("\nyou are " + (age - 1) + " years old");
        }
    }
}
