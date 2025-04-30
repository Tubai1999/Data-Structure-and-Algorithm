package Functional_interface.function;

public class MainFunction {
    public static void main(String[] args) {
        Function<String,Integer> obj = (Integer a)->{
            return a.toString();
        };
        System.out.println(obj.invokeFunction(5));
    }
}
