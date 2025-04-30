package Functional_interface.consumer;

public class MainConsumer {
    public static void main(String[] args) {
        Consumer<String> obj = (String s) ->{
            System.out.println("string value is: "+s);
        };
        obj.callConsumer("tridib");
    }
}
