public class varargs {
    static int sum(int ...arr) {
        int result=0;
        for(int a:arr) {
            result+=a;

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 2 and 3 is "+sum(2,3));
        System.out.println("Sum of 2,3,4,5 is "+sum(2,3,4,5));
        System.out.println("Sum of 2,3,4,5,6,7 is "+sum(2,3,4,5,6,7));

    }
}
