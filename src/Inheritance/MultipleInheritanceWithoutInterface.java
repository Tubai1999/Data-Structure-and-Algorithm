package Inheritance;

class gun{
    void fire(){
        System.out.println("soldier is firing");
    }
}
class knife{
    void stab(){
        System.out.println("soldier is stabbing");
    }
}
class soldier{
    private gun g;
    private knife k;
    soldier(){
        g = new gun();
        k = new knife();
    }
    void fire(){
        g.fire();
    }
    void stab(){
        k.stab();
    }
}

public class MultipleInheritanceWithoutInterface {
    public static void main(String[] args) {
        soldier obj = new soldier();
        obj.fire();
        obj.stab();
    }
}
