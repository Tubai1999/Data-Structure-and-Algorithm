package GenericClass;


class Parent1{

}

class Child1 extends Parent1{

}
public class MainExample5 {
    public static void main(String[] args) {
        Child1 childObj = new Child1();
        Parent1 parentObj = new Parent1();
       parentObj = childObj;
    }
}
