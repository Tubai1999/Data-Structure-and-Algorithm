//association example
package Association;

class Car{
    String model;
    Car(String model){
        model = this.model;
    }
    void display(){
        System.out.println("inside car class" + model);
    }
}

class Person{
    String name;
    Car car; //has a relation, Person has Car object
    Person(String name, Car car){
        this.name = name;
        this.car = car;
    }
}


public class AssociationExample {
    public static void main(String[] args) {
        Car car = new Car("Swift");
        Person person = new Person("Tridib", car);
    }
}
