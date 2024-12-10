package Constructor;

public class LearnConstructor1 {
    int age;
    public LearnConstructor1(){
//        this(20);
    }

    public LearnConstructor1(int age){
        System.out.println("inside LearnConstructor1 "+ age);
        this.age=age;
    }

    public void method1(){
        System.out.println("inside method1");
    }

    public void method2(){
        this.method1();
    }


    public static void main(String[] args) {
        new LearnConstructor1().method2();
    }
}
