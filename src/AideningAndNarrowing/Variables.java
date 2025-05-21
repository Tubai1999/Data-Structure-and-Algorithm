package AideningAndNarrowing;

class A{
    int val = 10;
}
public class Variables {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.val);
        A obj2 = new A();
        obj2.val = 20;
        System.out.println(obj2.val);
    }
}
