package MultiThreading;

public class MonitorLockCreateThread implements Runnable{
    MonitorLock obj = new MonitorLock();
    @Override
    public void run() {
        obj.task3();
        System.out.println("inside MonitorLockCreateThread");
    }
}
