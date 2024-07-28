class phone{
    public void name(){
        System.out.println("My name is Java");
    }
    public void greet(){
        System.out.println("Good MORNING");
    }
}
class smartphone extends phone{
    @Override
    public void name(){
        System.out.println("My name is Java in class 2");
    }

    public void swagat(){
        System.out.println("Apka swagat h");
    }
}
public class dybamic_mehtodf_dispatch {
    public static void main(String[] args) {
        phone obj = new phone();
        smartphone smobj =new smartphone();
        phone ph = new smartphone(); /*superclass object reference can be equal to subclass */
        //smartphone sp=new phone(); /*subclass object cannot be reference of superclass*/
        obj.name();
        obj.greet();


    }
}
