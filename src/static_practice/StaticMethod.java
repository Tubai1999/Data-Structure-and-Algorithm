package static_practice;

public class StaticMethod {
    int price = 10;
    void dummyMethod(){
        System.out.println("inside non static method "+this.price);
    }
    public static void main(String[] args) {
        StaticMethod obj = new StaticMethod();
        obj.dummyMethod();
        System.out.println(obj.price);
    }
}
