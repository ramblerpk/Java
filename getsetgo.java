class school {
    public String name;
    public char grade;
    public int marks;

    public String getName(){
       return name;
    }
    public void setName(String name) {
            this.name = name;
    }

    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade){
        this.grade=grade;
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }

}
public class getsetgo {
    public static void main(String[] args) {
        school s1 = new school();
        s1.setName("Piyush");
        s1.setGrade('A');
        s1.setMarks(92);
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());
        System.out.println(s1.getGrade());

    }
}
