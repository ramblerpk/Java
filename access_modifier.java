import java.sql.SQLOutput;

class MyStaff {
   private  int id;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId() {
        return id;
    }
}
public class access_modifier {
    public static void main(String[] args) {
        MyStaff harry = new MyStaff();
      /*  harry.id = 20;
        harry.name = "CodeWithHarry";  --> throw an error due to private access modifier */
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(250);
        System.out.println("Id of Harry is " + harry.getId());

    }
}
