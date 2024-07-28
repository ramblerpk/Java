public class practques7 {
    static void table(int n) {
        for(int i=1;i<=10;i++) {
            System.out.format("%d X %d = %d \n",n,i,n*i);
        }

    }
    static void pattern1(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sumrec(int n) {
        if(n==1){
            return 1;
        }
        else{
            return n+sumrec(n-1);
        }
    }
    static void pattern2(int n) {
        for(int i=n;i>0;i--) {
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static int fib(int n){
        if(n==1) {
            return 0;
        }
        else if(n==2) {
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
    static double temp(int a) {
        if(a==0) {
            return 32;
        }
        else {
            return  a*9.0/5.0 + 32.0;
        }
    }
    public static void main(String[] args) {
      /* // table(7);
       // pattern1(5);
        int c=sumrec(4);
        System.out.println(c);
        pattern2(4);     */
        int c =fib(6);
   //     System.out.println(c);
        double d= temp(0);
        System.out.println(d);


    }
}
