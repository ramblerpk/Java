import java.util.Scanner;
public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the km");
        float a = sc.nextFloat();
        System.out.println(a + "km is equal to" + a*0.62f + " miles ");
    }
}
