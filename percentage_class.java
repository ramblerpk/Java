import java.util.Scanner;
public class percentage_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("marks of sub1");
        int full_marks = 500;
        int a = sc.nextInt();
        System.out.println("marks of sub2");
        int b = sc.nextInt();
        System.out.println("marks of sub3");
        int c = sc.nextInt();
        System.out.println("marks of sub4");
        int d = sc.nextInt();
        System.out.println("marks of sub5");
        int e = sc.nextInt();
        float sum =  a+b+c+d+e;
        System.out.println("total marks obtained"+sum);
        System.out.println("percentage marks obtained is :" + sum/5 + "%");


    }
}
