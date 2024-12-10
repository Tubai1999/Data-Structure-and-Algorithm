package exception;

public class ExceptionLearning {

    public static void main(String[] args) {
        try {

                int[] arr = {1,2};
            System.out.println(arr[2]);
            int val = 10/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("this block alaways executed");
        }
    }
}
