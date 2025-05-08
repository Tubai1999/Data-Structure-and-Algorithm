package Interface;


interface X{
    default void method(){
        System.out.println("inside X interface default");
    }
}

interface Y{
    default void method(){
        System.out.println("inside Y interface default");
    }
}
public class TwoInterfaceSameDefault implements Y{
    public static void main(String[] args) {
        Y obj = new TwoInterfaceSameDefault();
        obj.method();
    }

//    @Override
//    public void method() {
//        X.super.method();
//    }
}
