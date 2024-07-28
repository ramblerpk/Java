class Studemts {
    String name;
    int marks;

}
public class pract_arry {
    public static void main(String[] args) {
//        int nums[][] = new int[3][3];
//        nums[0][0] = 3;
//        nums[0][1] = 3;
//        nums[0][2] = 3;
//        nums[1][0] = 3;
//        nums[1][1] = 3;
//        nums[1][2] = 3;
//       for (int i=0;i<nums.length;i++){
//           for (int j=0;j<nums[i].length;j++) {
//               System.out.print(nums[i][j] + " ");
//
//           }
//           System.out.println();
//       }
//        System.out.println( "Length of array is  : "  + nums.length);

        Studemts s1 = new Studemts();
        s1.name = "Piyush";
        s1.marks = 100;

        Studemts s2 = new Studemts();
        s2.name = "Parul";
        s2.marks = 100;

        Studemts studemts[] = new Studemts[2];
        studemts[0] = s1;
        studemts[1]= s2;
       /* for(int i=0;i< studemts.length;i++){
            System.out.println(studemts[i].name + " : " +  studemts[i].marks);
        }*/
        for(Studemts stud : studemts) {
            System.out.println(stud.name + ":" + stud.marks);
        }
    }
}
