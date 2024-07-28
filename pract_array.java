public class pract_array {
    public static void main(String[] args) {
      /*  float[] num = {1.2f,2.2f,3.2f,4.2f,5.2f };
        float sum =0;
        for (float element:num) {
            sum=sum+element;

        }
        System.out.println(sum);


        float[] num = {1.2f,2.2f,3.2f,4.2f,5.2f };
       float digi = 9.2f;
       boolean isInArray = false;
       for (float element:num) {
           if (digi == element) {
               isInArray = true;
               break;
           }
       }
       if (isInArray) {
           System.out.println("the number is present in array");
       }
       else {
           System.out.println("The number is not present in array");
       }


        float[] num = {1.2f,2.2f,3.2f,4.2f,5.2f };
        float sum =0;
        for (float element:num) {
            sum=sum+element;

        }
        System.out.println("the avg of marks is "+sum/num.length);

       */
        int [][]mat1={{2,3,4},
                      {3,4,5}};
        int [][]mat2={{4,5,6},
                      {7,8,9}};
        int [][]result={{0,0,0},
                        {0,0,0}};
        for(int i=0;i< mat1.length;i++) {
            for (int j=0;j<mat1[i].length;j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }



    }
}
