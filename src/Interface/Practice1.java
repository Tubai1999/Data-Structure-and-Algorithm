package Interface;


 interface A1 {
    public void methodA();
}

interface B1 extends A1{
     void methodB();
}

public class Practice1 implements B1 {
     public static int price = 10;
    public static void main(String[] args) {
        Practice1.price = 20;
        System.out.println(Practice1.price);
    }

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }
}
