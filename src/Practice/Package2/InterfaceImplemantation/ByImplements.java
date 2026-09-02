package Practice.Package2.InterfaceImplemantation;

interface A{
    void display();
}



public class ByImplements implements A {
    public static void main(String[] args) {
        ByImplements obj = new ByImplements();
        obj.display();
    }

    @Override
    public void display() {

    }
}
