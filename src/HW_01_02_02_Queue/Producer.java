package HW_01_02_02_Queue;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Dmytro on 28.06.2017.
 */
public class Producer implements Runnable {
    BlockingQueue<Integer> queue = null;
    int nextElement;
    Thread thread;

    Producer(BlockingQueue queue) {
        this.queue = queue;
        thread = new Thread();
        thread.start();
    }

    Scanner scanner = new Scanner(System.in);



    @Override
    public void run() {

        System.out.println("Enter number to add to collection.");
        System.out.println("Or any letter to quit program.");
        boolean correct = false;
        while (!correct) {
            try {
                nextElement = Integer.parseInt(scanner.next());
                correct = true;
            } catch (Exception e) {
                System.out.println("Good bye!");
                System.exit(0);
            }
        }

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
