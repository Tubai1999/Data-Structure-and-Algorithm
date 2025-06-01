package Practice.Package1;


class A{
     void insideA(){

    }
}

public class MainClass {

     protected void method(){

    }
    private int val = 10;
    public static void main(String[] args) {
        MainClass obj = new MainClass();
        System.out.println(obj.val);
        A obj1 = new A();
        obj1.insideA();
}
}
