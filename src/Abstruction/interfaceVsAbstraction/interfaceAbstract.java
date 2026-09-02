package Abstruction.interfaceVsAbstraction;


abstract class Animal{
    int leg=4;
    Animal(int leg){
        leg = this.leg;
        System.out.println("inside animal constructor");
    }
    abstract void roar();
     void walking(){
         System.out.println("animal is walking");
    }
}

abstract class Tiger extends Animal{
    Tiger(int leg) {
        super(leg);
    }

    abstract void running();
    void roar(){
        System.out.println("Tiger roaring");
    }
}

public class interfaceAbstract extends Tiger{
    interfaceAbstract(int leg) {
        super(leg);
    }

    @Override
    void running() {
        System.out.println("it is running inside main class");
    }
    public static void main(String[] args) {
        interfaceAbstract obj = new interfaceAbstract(4);

    }
}
