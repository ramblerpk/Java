import java.util.Arrays;
import java.util.Scanner;

public class demoo {
    public static void main(String[] args){/*
        String[] str = {"ganga","yamuna","saraswati"};
        String[]str1 = {"North","South","East", " West"};
        System.out.println(str[1]);
        System.out.println(str1[1]);*/
      /*  int arr[][] = new int[2][];
//        Scanner in = new Scanner(System.in);
        

        for(int []a : arr) {
            System.out.println(Arrays.toString(a));
        }*/
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i =arr[0];i<arr.length;i++){
            if(i==9){
                System.out.println("yes it is in array " );
            }
            else {
                System.out.println("not found");
            }
        }


    }
}
