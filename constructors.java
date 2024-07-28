class MyStaff1 {
    private  int id;
    private String name;
    private int salary;
    public MyStaff1 (String myName,int myId,int Salary){
        id = myId;
        name = myName;
        salary = Salary;
    }
    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId() {
        return id;
    }
    public void setSalary(int s) {
        this.salary= s;
    }
    public int getSalary(){
        return salary;
    }
}
public class constructors {
    public static void main(String[] args) {
        MyStaff1 harry = new MyStaff1("CodeWithHarry",20,10000);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
        System.out.println("Salary is "+ harry.getSalary());

    }
}
