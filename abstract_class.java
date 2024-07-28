 abstract class Base2 {
     public Base2() {
         System.out.println("constructor of base 2");
     }

     public void sayHello() {
         System.out.println("HEllo");
     }

     abstract void greet();
 }
 class child1 extends Base2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
 }

public class abstract_class {
    public static void main(String[] args) {
//        Base2 b2 = new Base2();  -------->this will throw error bcz abstract class cannot be instantiated
        child1 c1 = new child1();   /*ONLY CONCRERETE CLASS CAN BE INSTANTIATED*/

    }
}
