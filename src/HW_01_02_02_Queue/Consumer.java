package HW_01_02_02_Queue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Dmytro on 28.06.2017.
 */
public class Consumer implements Runnable {
    BlockingQueue<Integer> queue=null;

    Consumer(BlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        queue.remove();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
