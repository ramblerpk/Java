public class recursion {
    static int fatorial(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        else {
            return n*fatorial(n-1);
        }
    }
    public static void main(String[] args) {
        int a=4 ;
        System.out.println("factorial of a is : " +fatorial(a));

    }
}
