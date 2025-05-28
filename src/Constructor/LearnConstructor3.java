package Constructor;

public class LearnConstructor3 {

    void method2(){
        System.out.println("inside method2");
    }
    void method(){
        System.out.println("insdie method");
        this.method2();
    }
    public static void main(String[] args) {
//        method();
        LearnConstructor3 obj = new LearnConstructor3();
        obj.method();
    }
}
