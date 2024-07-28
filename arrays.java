public class arrays {
    public static void main(String[] args) {
         /*int [] marks = new int[5];
        marks[0]=100;
        marks[1]=70;
        marks[3]=70;
        marks[4]=90;
        System.out.println(marks[4]);
        int[]marks = {70,80,90,95,100};
        for (int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }
//        for printing in reverse order
        int[]marks = {70,80,90,95,100};
        for (int i=marks.length -1 ; i>=0;i--) {
            System.out.println(marks[i]);
        }
        System.out.println("Using for -each loop");
        for (int element: marks) {
            System.out.println(element);
        }



        //pb no 5
        int[]arr= {1,2,3,4,5,6} ;
        int l=arr.length;
        int n= Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++) {
            temp = arr[i];
            arr[i] = arr[l-i-1];


            arr[l-i-1] = temp;
        }
        for (int element:arr){
            System.out.print(" "+element);


        }


        int[]arr= {1,2,3,4,5,6,509,7757,45445,342,};
        int max=0;
        for (int e:arr) {
            if (e>max) {
                    max=e;
            }
        }
        System.out.println("The value of the max is " + max);
        System.out.println(Integer.MIN_VALUE);

          */
        boolean isSorted=true;
        int[]arr={1,3,5,6};

        for(int i=0;i<arr.length-1;i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;

            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
            }
            else {
                System.out.println("Array is not  sorted");
            }
        }


    }

