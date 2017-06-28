package HW_01_02_02_Queue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Dmytro on 28.06.2017.
 */
public class Producer implements Runnable {
    BlockingQueue<Integer> queue;
    int nextElement;

    Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        nextElement=0;
        while (true){
            try {
                queue.put(nextElement);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nextElement++;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
