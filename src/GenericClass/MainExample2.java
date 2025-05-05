package GenericClass;

import java.time.Period;

class Parent<T>{
    T var;

    T getValue(){
        return var;
    }

    void setValue(T var){
        this.var = var;
    }
}


public class MainExample2 extends Parent<String> {
    public static void main(String[] args) {
        Parent<String> obj = new MainExample2();
        obj.setValue("tridib");
        String s = obj.getValue();
        System.out.println(s);

//        -------------------------------------------
//        Parent<String> obj = new Parent<>();
//        obj.setValue("tridib");
//        String s = obj.getValue();
//        System.out.println(s);
    }
}
