package exception;

public class ExceptionHandling {
    public static void main(String[] args) throws MyCustomException {
        int[] arr = new int[5];
        throw new MyCustomException("custom exception");
//        try {
//            int val = arr[5];
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
    }
}


