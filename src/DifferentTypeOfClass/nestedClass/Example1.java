package DifferentTypeOfClass.nestedClass;


class B{
    void methodInA(){
        System.out.println("inside class B");
    }

    static int variable1 = 10;
    int variable2 = 20;
     class A{
        void methodInB(){
            System.out.println("inside class A"+variable1);
        }
        int variable1 = 663;

    }
}
public class Example1 {
    public static void main(String[] args) {
//        B.A obj = new B.A();
        B outerObj = new B();
        B.A innerObj = outerObj.new A();
        innerObj.methodInB();
        B obj2 = new B();
        obj2.methodInA();
    }
//    static class innerClass{
//
//    }
}
