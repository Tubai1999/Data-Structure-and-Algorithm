package OOPS2;

public class Learninterface {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.barking();
        obj.eat();
        Animal newObj = new Dog();
        newObj.eat();
    }
}

interface Animal{
    default void barking(){
        System.out.println("it's barking");
    }
    void eat();
}

class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("eating");
    }
}
