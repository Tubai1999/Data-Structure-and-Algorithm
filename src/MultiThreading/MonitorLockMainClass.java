package MultiThreading;

public class MonitorLockMainClass  {
    public static void main(String[] args) {
        MonitorLock obj = new MonitorLock();
        MonitorLockCreateThread obj1 = new MonitorLockCreateThread();
        Thread t1 = new Thread(() -> {obj.task1();});
        Thread t2 = new Thread(() -> {obj.task2();});
        Thread t3 = new Thread(obj1);
        t1.start();
        t2.start();
        t3.start();
    }


}
