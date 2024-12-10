package Polymorphism;
class Animal{
    void sound(){
        System.out.println("animal make sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog make sound");
    }

    void makeSound() {
        super.sound();
    }
    }

    class Cat extends Animal {
        void sound() {
            System.out.println("Cat make sound");
        }
    }

    public class Runtime {
        public static void main(String[] args) {
            Animal obj = new Dog();
            obj.sound();
            ((Dog) obj).makeSound();
        }
    }
