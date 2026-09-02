package SingletonClass.Practice;

public class Lazy {
    private static Lazy lazy;
    private Lazy(){

    }

    public static Lazy method(){
        lazy = new Lazy();
        return lazy;
    }

}
