package Interface;


interface outer{
    void outerMethod();
    interface inner{
        void innerMethod();
    }
}

public class NestedInterface implements outer,outer.inner{
    public static void main(String[] args) {
       outer.inner obj = new NestedInterface();
//        obj.outerMethod();
        obj.innerMethod();
    }

    @Override
    public void outerMethod() {
        System.out.println("outer method invoked");
    }

    @Override
    public void innerMethod() {
        System.out.println("inside innermethod");
    }
}
