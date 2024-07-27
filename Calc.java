class Simple {
    public int add(int a,int b){
        return a+b ;
    }
    public int sub(int a,int b){
        return a-b ;
    }

}
class Advance extends  Simple {
    public int multi(int a,int b) {
        return a*b;
    }
    public int div(int a,int b) {
        return a/b ;
    }
}
public class Calc {
    public static void main(String[] args) {
        Advance a = new Advance();
        int n1 = a.add(3,4);
        int n2 = a.sub(3,2);
        int n3 = a.multi(3,3);
        int n4 = a.div(4,4);

        System.out.println(n3);

    }
}
