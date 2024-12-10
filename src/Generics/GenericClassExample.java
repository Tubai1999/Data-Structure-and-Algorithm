package Generics;

public class GenericClassExample {
    public static void main(String[] args) {
        Box<Integer> obj = new Box<>(10);
        System.out.println(obj.value);

        Box<String> obj1 = new Box<>("Tridib");
        System.out.println(obj1.value);
    }
}

class Box<T>{
    public T value;
    Box(T value){
        this.value=value;
    }
}
