public class brk_cont {
    public static void main(String[] args) {
        for(int i=1;i<5;i++) {
            System.out.println(i);
            System.out.println("Java is fun");

            if (i == 3) {
                System.out.println("ENding the loop");
                break;
            }
        }
        /*for (int i=0;i<6;i++) {
            if (i==3) {
                System.out.println("Skip");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is fun");
        } */
    }
}
