package Autoboxing_unboxing_generics;

public class Auto_unBoxing {
    public static void main(String[] args) {
//        Integer value1 = 123;
//        int value2 = value1;
//
//        System.out.println(value1.getClass().getSimpleName());
//        System.out.println(value2);
        E<String> obj  = new E<>("hhh");
        E<Integer> obj2 = new E<>(5);
//        genericMethod("555");
        Auto_unBoxing obj3 = new Auto_unBoxing();
        obj3.genericMethod((125));

    }
    //bounded generic
    public  <T extends Number> void genericMethod(T data){
        System.out.println(data);
    }
}

class E<T>{
    T data;
    E(T data){
        this.data = data;
    }

    void getvalue( T data){
        System.out.println("the data is: "+ data);
    }
}