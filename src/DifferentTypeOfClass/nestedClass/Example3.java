package DifferentTypeOfClass.nestedClass;

class A{

    int nonstaticVariable = 10;
    static int staticVariable = 20;

    void method1(){
        class B{
            void methodForB(){
                System.out.println("method invoked inside B"+nonstaticVariable+staticVariable);
            }
        }
        B innerBObj = new B();
        innerBObj.methodForB();
    }

}
public class Example3 {
    public static void main(String[] args) {
        A outerObj = new A();
        outerObj.method1();
    }
}
