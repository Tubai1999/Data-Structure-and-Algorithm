package OOPS1;

public class Vehicle {
    Vehicle(){
        System.out.println("parent default constructor");
    }
    Vehicle(int wheel){
        System.out.println("parent parameterized constructor");
    }
    int wheel;
    void start(){
        System.out.println("vehicle starting");
    }
}
