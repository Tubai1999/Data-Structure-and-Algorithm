package Dependency_injection;

import practiceInterview.synechron.Interface.Car;

interface Engine{
    void start();
}

class PetrolEngine implements Engine{
    public void start(){
        System.out.println("petrol engine starting");
    }
}
class DieselEngine implements Engine{
    public void start(){
        System.out.println("Diesel engine starting");
    }
}

class Car1{

    private Engine engine;

    public void setEngine(Engine engine){
        this.engine = engine;
    }
//    Car1(Engine engine){
//        this.engine = engine;
//    }

    void helper(){
        engine.start();
    }
}


public class MainClass {
    public static void main(String[] args) {
        PetrolEngine petrolEngine = new PetrolEngine();
//        Car1 obj = new Car1(petrolEngine);
        Car1 obj = new Car1();
        obj.setEngine(petrolEngine);
        obj.helper();
    }
}
