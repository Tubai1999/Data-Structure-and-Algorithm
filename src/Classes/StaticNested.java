package Classes;



class A{
    int val;
    static class B{
        void method(){
            System.out.println("inside nested static class");
        }
    }

}
public class StaticNested {
    public static void main(String[] args) {
        A.B obj = new A.B();
        obj.method();
        A obj1 = new A();
        System.out.println(obj1.val);
    }
}
