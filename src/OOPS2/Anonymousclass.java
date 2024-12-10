package OOPS2;

public class Anonymousclass {
    public static void main(String[] args) {
        Mouse obj1 = new Mouse();
        obj1.test();
        SuperInterface obj2 = new SuperInterface() {
            @Override
            public void interfaceMethod() {
                System.out.println("anonymous class in interface");
            }
        };
        obj2.interfaceMethod();
    }
}
class  Mouse{
    void test(){
        Laptop obj = new Laptop(){
            void click(){
                System.out.println("inside anonymousclass");
            }
            void sing(){

            }
        };
        obj.click();

    }

}
class Laptop {
    void click(){
        System.out.println("it is clicking");
    }
}

interface SuperInterface{
    void interfaceMethod();
}



//class Mouse{
//    void click(){
//        System.out.println("it is clicking");
//    }
//}
