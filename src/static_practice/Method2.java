package static_practice;

public class Method2 {
    public static void main(String[] args) {
        System.out.println(Method1.extraPrice);
        Method1 obj = new Method1();
        System.out.println(obj.method(10,20));
        System.out.println(Method1.staticMethod(50,10,obj));
        obj.sum(1,2);
//        obj.sum(1,2,3,4);
    }
}
