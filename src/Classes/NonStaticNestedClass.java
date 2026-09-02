package Classes;
class A1{
    int var;
    class B1{
        void method(){
            System.out.println("inside method");
        }
    }
}
public class NonStaticNestedClass {
    public static void main(String[] args) {
        A1 obj = new A1();
        A1.B1 innerClassObj = obj.new B1();
        innerClassObj.method();
    }
}
