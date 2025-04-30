package Functional_interface.predicate;

public class MainPredicate {
    public static void main(String[] args) {
        Predicate<Integer> obj = (Integer a)->{
            if(a%2 == 0) return true;
            else return false;
        };
        System.out.println(obj.invokePedicate(5));
    }
}
