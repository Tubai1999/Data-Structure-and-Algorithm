package UdemyJavaPractice;

public class EagerInitialization {
   private static EagerInitialization obj = new EagerInitialization();
    private EagerInitialization(){
    }
    public static EagerInitialization getObj(){
        return obj;
    }
}

class EagerTest{
    public static void main(String[] args) {
        EagerInitialization.getObj();
//        EagerInitialization e1=EagerInitialization.obj;
    }
}
