package OOPS2;

public class Nestedclass {
    public static void main(String[] args) {
        Inner obj = new Nestedclass().new Inner();
        obj.response();
        Staticinner obj1 = new Nestedclass.Staticinner();
        obj1.staticresponse();
    }
     class Inner{
        void response(){
            System.out.println("it's responsing");
        }
    }

    static class Staticinner{
        void staticresponse(){
            System.out.println("innner class responding");
        }
    }
}
