public class methods {
    static int logic(int x,int y) {
        int z;
        if(x>y) {
            z=(x+y)*5;
        }
        else {
            z=x+y;
        }
        return z;

    }
    public static void main(String[] args) {
        int a=7;
        int b=15;
        int c=logic(a,b);
        int a1=2;
        int b1=1;
        int c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);


    }
}
