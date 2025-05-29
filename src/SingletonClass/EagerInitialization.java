package SingletonClass;

class EagerExample{


    //comment
    static EagerExample eagerExample = new EagerExample();
    private EagerExample(){

    }
    public static EagerExample getInstance(){
        return eagerExample;
    }
}

public class EagerInitialization {
    public static void main(String[] args) {
//        EagerExample obj = new EagerExample();
       EagerExample eagerExample =  EagerExample.getInstance();

    }
}
