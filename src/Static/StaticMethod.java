package Static;

public class StaticMethod {
    public static void main(String[] args) {
    Helper obj = new Helper();
        System.out.println(Helper.price);
    }
}

class Helper{
    static int price=30;
    int val= 40;

    static void method(){
        System.out.println(price);

    }
}
