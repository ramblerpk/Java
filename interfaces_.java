interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("PEE PEE");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("speeding up");
    }
}
public class interfaces_ {
    public static void main(String[] args) {
        AvonCycle piyush = new AvonCycle();
        piyush.applyBrake(2);
        System.out.println(piyush.a);
//You can create properties in interface
        //You cannot modify properties in interface as they are final eg- piyush.a =456;(a value cannot be changed bcz it is already defined in interface.

    }
}
