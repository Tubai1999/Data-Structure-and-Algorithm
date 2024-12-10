package Generics;

public class Example1 {

    public static void main(String[] args) {
        Employee<Integer> obj1 = new Employee<>(12);
        Employee<String> obj2 = new Employee<>("256");

        System.out.println(obj1.id);
        System.out.println(obj2.id);
    }
}

class Employee<T>{

    T id;
    Employee(T id){
        this.id = id;
    }

}
