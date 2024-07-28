class circles {
    circles(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }
    public int radius;
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinders extends circles{
    public int height;
    cylinders(int r,int h){
        super(r);
        System.out.println("I am a cylinder paramerterized constructor");
        this.height =h;

    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}
public class ch10_pract_set {
    public static void main(String[] args) {
//        circles objc = new circles(2);
        cylinders obj = new cylinders(2,4);



    }
}
