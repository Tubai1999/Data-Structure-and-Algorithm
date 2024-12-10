package exception;
import com.sun.security.jgss.GSSUtil;
public class ThrowLearning {
    public static void main(String[] args) {
        int[] arr = {1,2};
        try{
            Adult(1);
            builtInExceptionCheck(arr);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    static void Adult(int age) throws CustomException{
        if(age<18) throw new CustomException("he/she is not an adult");
        else System.out.println("he/she is an adult");
    }

    static void builtInExceptionCheck(int[] arr) throws ArrayIndexOutOfBoundsException{
        System.out.println(arr[2]);
    }
}
class CustomException extends Exception{
    CustomException(String s){
        super(s+"  exception caught");
    }
}
