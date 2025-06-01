package Practice.Package2.InterfaceImplemantation;

interface A1{
    void display();
}
public class ByLambda {
    public static void main(String[] args) {
        A1 obj = ()->{
            System.out.println("using lambda");
        };
        obj.display();
    }
}
