package MethodHiding;

public class Parent {
   static void method1(){
        System.out.println("inside parent");
    }

}

class Child extends Parent{
   static void method1(){
        System.out.println("inside child");
    }
    public static void main(String[] args) {
        Parent childObj = new Child();
        Parent.method1();
        Child.method1();
    }

}
