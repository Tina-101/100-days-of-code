import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input sentence for word counting: ");
        String sentence = scan.nextLine();

        String[] wordArray = sentence.trim().split("\\s+");
        int wordCount = wordArray.length;

        System.out.println("Word count is = " + wordCount);
    }
}
