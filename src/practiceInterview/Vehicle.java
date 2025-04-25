package practiceInterview;


class Car{
    void honk(){
        System.out.println("car is honking");
    }
}
public class Vehicle extends Car {
    void starting(){ //
        System.out.println("vehicle started");
    }
    public static void main(String[] args) {
        Vehicle obj1 = new Vehicle();
        Car obj = new Vehicle();
        obj.honk();
        obj1.starting();

    }
}
