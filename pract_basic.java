class Calculator {
    public int add(int a, int b) {
        System.out.println("The result of 2 number is :");
        int r = a + b;
        return r;
    }

    public int add(int a, int b, int c) {
        System.out.println("The result of 3 number is : ");
        return  (a+b+c);
    }
}
class Computer {
    public void playMusic() {
        System.out.println("Playing Music.......");
    }
    public String  GetMeAPen(int cost)
    {
        if( cost>=10)
            return " Pen";

        return "Nothing";

    }
}
public class pract_basic {
    public static void main(String[] args) {
//        int num1= 5;
//        int num2= 5;
//        Calculator cal = new Calculator();
//        int result = cal.add(num1,num2);
//        System.out.println(result);
        Computer comp = new Computer();
        comp.playMusic();
        String str = comp.GetMeAPen(100);
        System.out.println(str);

        String name[]= new String[4];
        name[0]= "Piyush";
        name[1] = "Parul";
        name[2] = "Priyanka";
        name[3] = "Payal";
      /*  for(int i=0;i< name.length;i++){
            System.out.println(name[i]);
        }*/
        for(String n :name) {
            System.out.println(n);
        }


    }
}
