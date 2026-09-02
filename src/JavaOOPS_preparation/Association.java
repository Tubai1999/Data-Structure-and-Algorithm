package JavaOOPS_preparation;

public class Association {

    public static void main(String[] args) {
        A obj1 = new A(20);
        B obj2 = new B("tridib",obj1);
        System.out.println(obj2.name +"his age is "+obj2.obj.age);
    }
}

class A{
    int age;
    A(int age){
        this.age = age;
    }

}

class B{
    String name;
    A obj;
    B(String name, A obj){
        this.name = name;
        this.obj = obj;
    }
}
