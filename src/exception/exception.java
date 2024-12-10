package exception;

public class exception {

    public static void main(String[] args) {
        int[] a = {1,2};
        try {
//            System.out.println(10 / 0);
//            System.out.println(a[4]);
//            function(a);
                throw new myexception("custom exception throwing");
        }
        catch (Exception e){
            System.out.println(e);
        }
       finally {
            System.out.println("it is alaways going to execute");
        }
    }
    static void function(int[] arr) throws Exception{
        System.out.println(arr[4]);
    }
}
class myexception extends Exception{
    myexception(String s){
//        System.out.println(s);
        super(s);
    }
}
