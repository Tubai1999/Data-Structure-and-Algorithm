package Interface.FuntionalInterfaceType;

import MultiThreading.CreateThread;

interface Consumer<T>{
    void consumerMethod(T t);
}

interface Supplier<T>{
    String supplierMethod();
}

interface Function<T,R>{
    T functionMethod(R r);
}

interface Predicate<T>{
    boolean predicateMethod(T t);
}

public class ConsumerPractice  {
    public static void main(String[] args) {
        Consumer<Integer> consumer = ((val)->{
            System.out.println("value is: "+val);
        });
        consumer.consumerMethod(5);

        Supplier<String> supplier = (()-> "supplying value");
        System.out.println(supplier.supplierMethod());

        Function<Integer,String> function = ((s)-> s.length());
        System.out.println(function.functionMethod("tridib"));

        Predicate<Integer> predicate = ((val)->val%2==0);
        System.out.println(predicate.predicateMethod(3));
    }
}
