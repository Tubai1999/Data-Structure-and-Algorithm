package Classes.SingletonPratice;


class LazyInitialization{
    static LazyInitialization lazyInitialization;
    private LazyInitialization(){
    }
    public static LazyInitialization getInstance(){
        if(lazyInitialization==null) return new LazyInitialization();
        return lazyInitialization;
    }
}

public class Lazy {
    public static void main(String[] args) {
        LazyInitialization obj = LazyInitialization.getInstance();
    }
}
