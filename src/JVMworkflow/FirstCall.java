package JVMworkflow;

public class FirstCall {
    void method1(){
        System.out.println("inside method1");
    }

}

class Example{
    public static void main(String[] args) {
        FirstCall obj = new FirstCall();
        obj.method1();

    }
}
