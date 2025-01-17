package Practice;

class Animal{
    Animal(){
        System.out.println("inside animal");
    }
    Animal(String name){
        System.out.println("name is "+name);
    }
}

class Dog extends Animal{

    Dog(){
        System.out.println("inside dog");
    }
    Dog(int a){
//        this();
        super("jsdf");
        System.out.println("parameterized");
    }
}

public class practice {
    public static void main(String[] args) {
        Dog dog = new Dog(5);
    }
}
