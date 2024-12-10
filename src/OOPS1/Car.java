package OOPS1;

public class Car extends Vehicle{
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheel = 4;

        obj.start();

    }
    void start(){

        System.out.println("car is starting");
        super.start();

    }
    Car(){
        super(4);
    }
}
