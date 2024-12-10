package Abstruction;

public class Abstruct1 extends Vehicle{

    @Override
    public void Bus() {
        System.out.println("this is bus");
    }
    @Override
    public void Scooty() {
        System.out.println("this is scooty section");
    }
    public static void main(String[] args) {
        Abstruct1 obj = new Abstruct1();
        obj.Bus();
        obj.Scooty();
        obj.concrete();
    }
}

abstract class Vehicle{
    abstract public void Bus();
    abstract public void Scooty();

    public void concrete(){
        System.out.println("this is concrete class");
    }
}
