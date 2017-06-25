package HW_01_02_02_Queue;

/**
 * Created by Dmytro on 25.06.2017.
 */
public class ThreadForQueue implements Runnable {
    String threadName;
    Thread thread;

    ThreadForQueue(String threadName) {
        QueueHolder m;
        this.threadName = threadName;
        thread = new Thread();
        System.out.println("Thread " +threadName +" starts.");
        thread.start();
    }

    @Override
    public void run() {
         QueueHolder queueHolder = new QueueHolder();
         try {
             System.out.println(threadName +" is working.");
            queueHolder.automaticFillCollection();
            Thread.sleep(500);
        }catch (InterruptedException e){
             System.out.println(e);
         }

    }
}
