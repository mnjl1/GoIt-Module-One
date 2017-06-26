package HW_01_02_02_Queue;

/**
 * Created by Dmytro on 25.06.2017.
 */
public class ThreadForQueue2 implements Runnable {
    String name;
    Thread thread;

    ThreadForQueue2(String name){
        this.name = name;
        thread = new Thread(name);
        System.out.println("Second thread "+name +" starts.");

    }

    @Override
    public void run() {

        QueueHolder queueHolder2 = new QueueHolder();
        queueHolder2.automaticFillCollection();
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
