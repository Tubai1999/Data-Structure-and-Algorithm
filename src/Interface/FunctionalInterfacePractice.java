package Interface;

interface Parent{
    void abstractMethod();

    public String toString();
}

public class FunctionalInterfacePractice implements Parent {
    public static void main(String[] args) {
        FunctionalInterfacePractice obj = new FunctionalInterfacePractice();
        obj.abstractMethod();
        obj.toString();
    }

//    @Override
    public String toString(){
        System.out.println("inisde");
        return "sjfb";
    }

    @Override
    public void abstractMethod() {
        System.out.println("inside abstract method");
    }
}
