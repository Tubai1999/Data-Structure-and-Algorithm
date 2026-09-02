package Classes.SingletonPratice;

class EagerInitialization{
    private static EagerInitialization eagerObj = new EagerInitialization();
    private EagerInitialization(){

    }
    public static EagerInitialization getEagerObj(){
        return eagerObj;
    }
}

public class Eager {
    public static void main(String[] args) {
        EagerInitialization obj = EagerInitialization.getEagerObj();
    }
}
