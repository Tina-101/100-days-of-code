import java.util.ArrayList;
import java.util.Scanner;

public class Diary {

    public static void main(String[] args) throws Exception {

        ArrayList<Entries> entryList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String menu = "shall we journal today? type: \n1 to add a new entry \n2 to list all entries \n3 to exit. \n\n";
        System.out.println(menu);

        while (true) {
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("today's date: ");
                    String todaysDate = scan.nextLine();

                    System.out.println("today's entry: ");
                    String todaysEntry = scan.nextLine();

                    Entries entry = new Entries(todaysDate, todaysEntry);
                    entryList.add(entry);

                    System.out.println("Entry added. \n\n");
                    break;

                case 2:
                    System.out.println("Entries: ");
                    for (int i = 0; i < entryList.size(); i++) {
                        Entries e = entryList.get(i);
                        System.out.println((i + 1) + "\n" + e.getEntry() + "\n" + e.getDate() + " \n");
                    }
                    break;

                case 3:
                    System.out.println("Bye! ");
                    scan.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("invalid input. \nPress 1 to add a new entry or 3 to exit.");
                    choice = scan.nextInt();
                    break;
            }
        }

    }
}
