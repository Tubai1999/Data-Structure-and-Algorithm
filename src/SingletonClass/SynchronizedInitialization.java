package SingletonClass;

class synchronization{
    private static synchronization obj;
    private synchronization(){

    }

    synchronized public static synchronization method1(){
        if(obj == null) return new synchronization();
        else return obj;
    }

}
public class SynchronizedInitialization {
    public static void main(String[] args) {
       synchronization obj =  synchronization.method1();
    }
}
