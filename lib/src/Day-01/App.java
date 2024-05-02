import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        String menu = "To-do list\n ********\n\n Type:\n 1 to show menu \n 2 to list all tasks\n 3 to add a new task\n 4 to mark a task as 'done'\n 5 to exit \n";
        System.out.println(menu);

        while (true) {
            int input = scan.nextInt();
            scan.nextLine();

            switch (input) {

                case 1:
                    System.out.println(menu);
                    break;
                case 2:
                    System.out.println("tasks: ");
                    for (int i = 0; i < tasks.size(); i++) {
                        Task t = tasks.get(i);
                        System.out.println(
                                (i + 1) + " - " + t.getDescription() + ". \n " + (t.isDone() ? "Done" : "Not Done"));
                    }
                    System.out.println("\n\n");
                    break;
                case 3:
                    System.out.println("Add new task: ");
                    String description = scan.nextLine();
                    Task task = new Task(description);
                    tasks.add(task);
                    System.out.println("task added.");
                    System.out.println("\n\n");
                    break;
                case 4:
                    System.out.print("Enter the task number to mark as done: ");
                    int taskNumber = scan.nextInt();
                    if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                        Task selectedTask = tasks.get(taskNumber - 1);
                        selectedTask.setDone(true);
                        System.out.println("Task marked as done.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    System.out.println("\n\n");
                    break;

                case 5:
                    System.out.println("Bye!");
                    scan.close();
                    System.exit(0);

                default:
                    System.out.println("invalid number, girly. try again;");

                    System.out.println("\n\n");
            }
        }
    }
}