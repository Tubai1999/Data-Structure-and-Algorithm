package SingletonClass;

class Lazy{
    static Lazy lazy;
    private Lazy(){

    }
    public static Lazy lazyMethod(){
        if (lazy == null) return new Lazy();
        else return lazy;
    }
}

public class LazyInitialization {
    public static void main(String[] args) {
        Lazy obj = Lazy.lazyMethod();
    }
}
