package Practice.Package2;

interface bird{
    void fly();
}

class Eagle implements bird{
    public void fly(){
        System.out.println("Eagle is flying");
    }
}

public class InterfacePractice {
    public static void main(String[] args) {
        bird obj = new Eagle();
        obj.fly();
    }
}
