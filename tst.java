public class tst{
    public static void main(String args[]){
        try {
            String x=null;
            //int c = 12/0;//It will raise ArithmeticException
            //System.out.println(c);
            System.out.println(x.length());//It will raise NullPointerException
        }
        catch (Throwable e) //Generalized exception handler, which can handle both exceptions[one at one time]
        {
            System.out.println(e);
        }
    }
}