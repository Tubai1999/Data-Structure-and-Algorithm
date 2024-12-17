package Interface;

public class Functional_Interface {
    public static void main(String[] args) {
        System.out.println("inside functional interface");
        walk obj = (step,enable) ->{
            System.out.println("number of step is "+ step);
            return step;
        };
        obj.walkStep(4,true);
    }
}

interface walk{
    int walkStep(int step,boolean enable);
}
