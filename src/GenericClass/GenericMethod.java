package GenericClass;

public class GenericMethod {

    static <T> void display(T val){
        System.out.println(val);
    }
    public static void main(String[] args) {
        GenericMethod.display("ddd");
    }
}
