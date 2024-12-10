package Inheritance;


class subClass{
    int age=220;
    public subClass(){
        System.out.println("inside subclass constructor");
    }
    public void Method(){
        System.out.println("Inside subclass method");
    }
}
public class Inheritance1 extends subClass{

    public Inheritance1(){
        super();
        super.Method();
    }

    public void Method(){System.out.println("inside child class method");
   }
    public static void main(String[] args) {
        System.out.println(new Inheritance1().age);
        new Inheritance1().Method();
    }
}
