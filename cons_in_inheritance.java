class Base1 {
    Base1(){
        System.out.println("I am a contructor of base class");

    }
    Base1(int a){
        System.out.println(" I am an overloaded constructor with value a as " +  a  );
    }
  }
class Derived1 extends Base1 {
    Derived1(){
        System.out.println("I am a constructor of derived class");
        }
    Derived1(int a,int b){
        super(a);
        System.out.println("I am a derived overloaded class with value of b as " +  b);

    }
}
class child extends Derived1{
    child() {
        System.out.println("I am a child class");

    }
    child(int a,int b,int c) {
        super(a,b);
        System.out.println("I am a overloaded child class with value of c as " + c);
    }
}

public class cons_in_inheritance {
    public static void main(String[] args) {
        child c = new child(2,3,4);

    }
}
