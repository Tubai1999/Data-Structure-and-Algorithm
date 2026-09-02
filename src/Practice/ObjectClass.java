package Practice;

class Parent{
    void method(){
        System.out.println("inside Parent");
    }

    void method1(){
        System.out.println("inside method1");
    }
}
class Dummy extends Parent{
    void method(){
        System.out.println("inside method");
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Parent obj = new Dummy();
        obj.method1();
    }
}
