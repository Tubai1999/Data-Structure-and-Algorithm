package MultiThreading;

public class MonitorLock {
     synchronized void task1(){
         try {
             Thread.sleep(2000);
             System.out.println("inside task1");
         }catch (Exception e){

         }

    }

    void task2(){
        System.out.println("task2 outside synchronize");
         synchronized (this){
             System.out.println("inside task2");
         }

    }

    void task3(){
        System.out.println("inside task3");
    }
}
