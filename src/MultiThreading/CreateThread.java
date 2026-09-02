package MultiThreading;

public class CreateThread implements Runnable{
    @Override
    public void run() {
        System.out.println("here the thread is :"+ Thread.currentThread().getName());
    }
}
