package SingletonClass.Practice;

public class Synchronize {
    private static Synchronize synchronize;
    private Synchronize(){

    }

    public static synchronized Synchronize method(){
        synchronize = new Synchronize();
        return synchronize;
    }
}
