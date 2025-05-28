package Polymorphism;
import org.w3c.dom.ls.LSOutput;

class Animal1{
    void makeSound(){
        System.out.println("animal roaring");
    }
}

class Dog1 extends Animal1{
    void makeSound(){
        System.out.println("dog is barking");
    }
}

class Cat1 extends Animal1{
    void makeSound(){
        System.out.println("cat is doing mew mew");
    }
}



public class Generalization {
    public static void main(String[] args) {
//        Animal1 obj1 = new Dog1();
//        obj1.makeSound();
        Animal1[] arr = new Animal1[2];
        arr[0] = new Dog1();
        arr[0] = new Cat1();

        for(Animal1 obj:arr){
            obj.makeSound();
        }
    }
}
