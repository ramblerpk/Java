import java.sql.SQLOutput;
import java.util.Scanner;
public class day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day no");
        int day = sc.nextInt();
        switch (day) {
            case 1 :
                System.out.println("Monday");
            break;
            case 2 :
                System.out.println("Tuesday");
            break;
            case 3 :
                System.out.println("Wed");
            break;
            case 4:
                System.out.println("thursday");
            break;
            case 5 :
                System.out.println("friday");
            break;
            case 6 :
                System.out.println("sat");
            break;
            case 7 :
                System.out.println("Sunday");
            break;
            default:
                System.out.println("Enter a correct no");

        }
    }
}
