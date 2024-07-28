import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
      /*  System.out.println("ENter your age :");
       int age= sc.nextInt();
        if(age>17){
            System.out.println("YES , YOU CAN DRIVE");
        }
        else {
            System.out.println("NO YOU CANNOT DRIVE.");
        }
        boolean a = true;
        boolean b = false;
        if(a==false || b==true) {
            System.out.println("you are right");

        }
        else {
            System.out.println("you are wrong");
        } */
        System.out.println("Enter your age");
        int age =sc.nextInt();
      /*  if (age>50){
            System.out.println("You are senior");
        }
        else if(age>30)
        {
            System.out.println("You are experienced");
        }
        else{
            System.out.println("You are fresher");
        } */
        switch (age) {
            case 18 :
                System.out.println("You are going to become adult");
                break;
            case 23 :
                System.out.println("You are going to join a job");
                break;
            case 60 :
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }
    }
}
