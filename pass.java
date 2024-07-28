import java.util.Scanner;
public class pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of a");
        int a = sc.nextInt();
        System.out.println("Enter marks of b");;
        int b = sc.nextInt();
        System.out.println("Enter marks of c");
        int c = sc.nextInt();

        float avg = (a+b+c)/3.0f;
        System.out.println("your percentage is " + avg);
        if(avg>=40 && a>=33 && b>=33 &&c>=33){
            System.out.println("You are pass");
        }
        else {
            System.out.println("You are fail");
        }
    }
}
