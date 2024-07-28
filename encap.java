class human{
    private int age;
    private String name;
    public human(int a,String n)
    {
        age = a;
        name = n;
    }


    public int  getAge(){
                    return age;
                }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
                    return name;
                }

    public void setName(String name) {
        this.name = name;
    }
}
public class encap {
    public static void main(String[] args) {
//        human h1 = new human();
        human h2 = new human(1,"john");
//        h1.setAge(3);
//        h1.setName("Bella");
        System.out.println(h2.getAge() + " :" + h2.getName());

    }
}
