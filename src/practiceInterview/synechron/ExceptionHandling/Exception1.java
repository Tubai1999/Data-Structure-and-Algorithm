package practiceInterview.synechron.ExceptionHandling;

public class Exception1 {
    public static void main(String[] args) {
        try{
            int a = 10/0;
            System.out.println("exception happen in previous line");
        }
        catch (ArithmeticException e){
            System.out.println("exception caught");
        }catch(Exception ae){
            System.out.println(ae);
        }
        finally {
            System.out.println("it always execute wheather exception caught or not");
        }
        System.out.println("outside exception");

    }
}
