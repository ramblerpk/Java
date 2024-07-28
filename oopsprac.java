class Employee {

    int salary;
    String name;
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name= n;
    }
}
class CellPhoone {
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
    public void callingFriend(){
        System.out.println("Calling....");
    }
}
class square {
    int side;
    public int area() {
        return side*side;
    }
    public int perimeter () {
        return 4*side;
    }
}
class rectangle {
    int length;
    int breadth;
    public int area () {
        return length*breadth;
    }
    public int perimeter() {
        return 2*(length+breadth);
    }
}
class rockstar {
    public void run() {
        System.out.println("Running.....");

    }
    public void hit () {
        System.out.println("Hitting....");

    }
    public void fire (){
        System.out.println("Firing....");
    }
}
class circle {
    float r;
    public float area () {
        return 3.14f*r*r;
    }
}
public class oopsprac {
    public static void main(String[] args) {
      /*  Employee harry = new Employee();
        harry.setName ("cODEwITHhARRY");
        System.out.println(harry.getName());
        harry.salary = 200000;
        System.out.println(harry.getSalary());
        CellPhoone asus = new CellPhoone();
        asus.ring();
        asus.vibrate();
        asus.callingFriend(); */
//        Square problem
       /* square squ = new square();
        squ.side = 5;
        System.out.println(squ.area());
        System.out.println(squ.perimeter());
        rectangle  rec  = new rectangle();
        rec.length = 2;
        rec.breadth = 3;
        System.out.println("Area of rectangle = " +rec.area());
        System.out.println(rec.perimeter());
        rockstar tommy =new rockstar();
        tommy.hit();
        tommy.fire();
        tommy.run(); */
        circle cu = new circle();
        cu.r = 5 ;
        System.out.println(cu.area());

    }
}
