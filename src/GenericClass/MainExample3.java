package GenericClass;


class Example3{
    <T> void method1(T val){
        System.out.println("inside method1 "+val);
    }
}
public class MainExample3 {
    public static void main(String[] args) {
        Example3 obj = new Example3();
        obj.method1("dfe");
    }
}
