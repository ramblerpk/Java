//Basic Scanner use in Java
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
         Press Alt+Enter with your caret at the highlighted text to see how
         IntelliJ IDEA suggests fixing it.
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the pen:");
        String pen = sc.nextLine();

        System.out.println("Enter the cost of the pen: ");
        int cost = sc.nextInt();

        System.out.println("Name of the pen is : " + pen);
        System.out.println("Cost of the pen is : " + cost);

        }
    }
