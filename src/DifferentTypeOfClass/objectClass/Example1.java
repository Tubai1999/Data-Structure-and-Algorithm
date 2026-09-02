package DifferentTypeOfClass.objectClass;


class Parent{

}

public class Example1 extends Parent {
    void method(){
        System.out.println("inside method1");
    }

    @Override
    public String toString(){
        return "inside tostring";
    }

    public static void main(String[] args) {
        Object obj = new Example1();
        System.out.println(obj);
    }
}
