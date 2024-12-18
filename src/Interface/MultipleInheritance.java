package Interface;


interface A{
    void check();
    default void defaultMethod(){
        System.out.println("inside interface A");
    }
}

interface B{
    void check();
    default void defaultMethod(){
        System.out.println("inside interface B");
    }
}

public class MultipleInheritance implements A,B {
    @Override
    public void check() {
        System.out.println("chcking");
    }
    @Override
    public void defaultMethod() {
        A.super.defaultMethod();
        B.super.defaultMethod();
    }
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.check();
        obj.defaultMethod();
    }
}
