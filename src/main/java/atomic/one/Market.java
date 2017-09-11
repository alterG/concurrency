package atomic.one;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

public class Market extends Thread{
    AtomicLong index;

    public Market(AtomicLong index) {
        this.index = index;
    }


    public AtomicLong getIndex() {
        return index;
    }

    @Override
    public void run() {
        Random random = new Random();

        boolean rakNaGoreSvistnul = !false;
        while (rakNaGoreSvistnul) {
            try {
                index.addAndGet(random.nextInt(10));
                Thread.sleep(500);
                index.addAndGet(-random.nextInt(10));
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
