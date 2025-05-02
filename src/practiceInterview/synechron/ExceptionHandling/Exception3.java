package practiceInterview.synechron.ExceptionHandling;

public class Exception3 {
    public static void main(String[] args) {
        try {
            throw new MyException("throwing custom exception");
        }catch (MyException e){
            System.out.println(e);
        }
    }
}

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}
