package HW_01_02_02_Queue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Dmytro on 28.06.2017.
 */
public class Producer implements Runnable {
    BlockingQueue<Integer> queue = null;
    int nextElement=0;
    Thread thread;

    Producer(BlockingQueue queue) {
        this.queue = queue;
        thread = new Thread();
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Producing....");
            try {
                queue.put(nextElement);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(queue);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nextElement++;
    }
}
