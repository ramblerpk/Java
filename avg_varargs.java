public class avg_varargs {
    static float avg(float...arr) {
        float sum=0;
        float avg=0;
        for(float e:arr){
            sum+=e;
        }
        avg=sum/arr.length;
        return avg;

    }

    public static void main(String[] args) {
        System.out.println(avg(2,3,4));
    }
}