package Abstruction.interfaceVsAbstraction;

interface Tiger{
    void roaring();
}
abstract class Animal{
    abstract void abstractMethod();
    void concreteMethod(){
        System.out.println("inside concrete method");
    }

}

public class interfaceAbstract extends Animal implements Tiger {
    public static void main(String[] args) {
        Animal obj = new interfaceAbstract();
        obj.concreteMethod();
        obj.abstractMethod();

    }

    public void roaring(){
        System.out.println("tiger is roaring");
    }
    void normalMethod(){
        System.out.println("inside interfaceAbstract method");
    }
    void abstractMethod() {
        System.out.println("implemented abstract method from abstract class");
    }
}
