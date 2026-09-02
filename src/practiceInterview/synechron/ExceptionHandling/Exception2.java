package practiceInterview.synechron.ExceptionHandling;

public class Exception2 {

   static void dummyFunction() throws Exception{

    }
    public static void main(String[] args) {
        int a = 4;
        try{
//            if(a<5) throw new NoSuchFieldException();
            dummyFunction();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
