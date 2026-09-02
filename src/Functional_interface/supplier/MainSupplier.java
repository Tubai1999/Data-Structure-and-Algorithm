package Functional_interface.supplier;

public class   MainSupplier {
    public static void main(String[] args) {
//        supplier<String> obj = ()->{
//            return "invoked supplier";
//        };
        supplier<String> obj = ()->
            "invoked supplier";
        ;
        System.out.println(obj.invokeSupplier());
    }
}
