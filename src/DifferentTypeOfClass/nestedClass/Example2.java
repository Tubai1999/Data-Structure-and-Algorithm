package DifferentTypeOfClass.nestedClass;
class Parent{
    private static class Child{
        void method1(){
            System.out.println("inside method 1");
        }
    }
    void display(){
        Child obj  = new Child();
        obj.method1();
    }
}

public class Example2 {
    public static void main(String[] args) {
        Parent obj = new Parent();
//        Parent.Child innerObj = new Parent.Child();
        obj.display();
    }
}
