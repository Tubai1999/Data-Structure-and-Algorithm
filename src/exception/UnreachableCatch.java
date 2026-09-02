package exception;

public class UnreachableCatch {
    public static void main(String[] args) {
        try{
            int a = 10/0;
        }catch (Exception e){
            System.out.println(e);
        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//        }
    }
}
