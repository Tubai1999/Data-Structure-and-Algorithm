package OOPS2;

public class Vehicle {

    public static void main(String[] args) {
    Taigun obj = new Taigun();
    obj.start();
    obj.honk();
    }
}
abstract class Car{
    void start(){
        System.out.println("car is starting");
    }
    abstract void honk();
}

class Taigun extends Car{
    @Override
    void honk() {
        System.out.println("car is honking");
    }
}
