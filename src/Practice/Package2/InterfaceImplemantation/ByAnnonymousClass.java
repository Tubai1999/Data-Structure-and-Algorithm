package Practice.Package2.InterfaceImplemantation;

interface first{
    void display();
}

public class ByAnnonymousClass{
    public static void main(String[] args) {
        first obj = new first() {
            @Override
            public void display() {
                System.out.println("implements through  annonymous class");
            }
        };
        obj.display();
    }
    public void display(){

    }
}
