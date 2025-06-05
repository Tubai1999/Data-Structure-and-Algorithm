package Interface;
interface LivingThing{
//    void canBreath();
    default void living(){
        System.out.println("LIVINGTHING: Living thing default method");
    }
    default void color(){
        System.out.println("inside living thing color");
    }

    static void staticMethod(){
        System.out.println("inside livingthing static method");
    }
}
interface Bird extends LivingThing{

//    void color();
default void living(){
    System.out.println("BIRD: Living thing default method");
}
    default void method(){
        System.out.println("inside default method");
    }
}
class Eagle implements Bird{
    @Override
    public void color() {
        System.out.println("Eagle's color is brown and white");
    }
}

public class DefaultMethodPractice implements Bird {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.living();
//        eagle.color();
//        obj.living();
//        DefaultMethodPractice obj1 = new DefaultMethodPractice();
//        obj1.method();
    }

    @Override
    public void color() {

    }
}
