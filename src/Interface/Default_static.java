package Interface;
interface  Animal{
    void bark();
    default void defaultAnimal(){
        System.out.println("it is a default method");
    }
    static void staticAnimal(){
        System.out.println("it is static method ");
    }
}

public class Default_static {
    public static void main(String[] args) {
//        Default_static obj = new Default_static();
//        obj.bark();
//        obj.defaultAnimal();
//        Animal.staticAnimal();
        Animal obj = () -> {
            System.out.println("it is barking");
        };
        obj.bark();
    }

//    @Override
//    public void bark() {
//        System.out.println("it is barking");
//    }
}
