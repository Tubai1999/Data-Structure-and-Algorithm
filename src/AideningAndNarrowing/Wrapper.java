package AideningAndNarrowing;

public class Wrapper {
    public static void main(String[] args) {
        Integer x = 10;
        method(x);
        System.out.println(x);
    }

    static void method(Integer a){
        a = 30;
        System.out.println(a);
    }
}
