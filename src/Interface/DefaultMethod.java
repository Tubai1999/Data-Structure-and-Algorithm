package Interface;


interface interface1{
    void method1();
    default void method2(){
        System.out.println("inside default method");
    }
}

class Dummy implements interface1{

    public static void main(String[] args) {

    }
    @Override
    public void method1() {
        System.out.println("inside dummy");
    }


}
public class DefaultMethod implements interface1{
    public static void main(String[] args) {
        DefaultMethod obj = new DefaultMethod();
        obj.method1();
        obj.method2();
    }

    @Override
    public void method1() {
        System.out.println("inside method1");
    }
}
