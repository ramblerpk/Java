import java.util.Scanner;
public class web {
    public static void main(String[] args) {
     /*   Scanner sc= new Scanner(System.in);
        System.out.println("Enter the url");
       String url =sc.next();
       if(url.endsWith("com")) {
           System.out.println("it is comm");
       }
       else if (url.endsWith("in")) {
           System.out.println("it is indian");
       }
       else {
           System.out.println("unknown url");
       } */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Year to check if it is a leap year or not : ");
        int year = scan.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println(year + " is a leap year");
        else {
            System.out.println(year + " is not a leap year");
    }

    }
}
