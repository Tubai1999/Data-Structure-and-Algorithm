package Inheritance;

public class Inheritance2 extends Car {
    int wheel;
    void start(){
        System.out.println("method in child class");
//        super.start();
    }
    public static void main(String[] args) {
        Inheritance2 obj = new Inheritance2();
//        Car obj = new Inheritance2();
        obj.start();
        obj.wheel = 4;

    }
}

class Car{

    Car(){
        System.out.println("inside car constructor");
    }
    void start(){
        System.out.println("method in parent class");
    }
}
