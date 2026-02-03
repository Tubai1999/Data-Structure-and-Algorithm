package Revise.Generic;

public class GenericClass {
    public static void main(String[] args) {
        Demo obj = new Demo<Integer>();
        obj.helperMethod("jhbw");
    }
}

class Demo<T>{
//    T val=(Object10;
     void helperMethod(T val){
        System.out.println("value is "+val);
    }

//    void wildCard(<?> val){
//
//    }
}
