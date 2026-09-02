package MultiThreading;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        CreateThread createThread = new CreateThread();
        Thread thread = new Thread(createThread);
        thread.start();
    }
}
