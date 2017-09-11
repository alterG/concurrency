package atomic.one;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

public class MarketInt extends Thread{
    int index;

    public MarketInt(int index) {
        this.index = index;
    }


    public int getIndex() {
        return index;
    }

    @Override
    public void run() {
        Random random = new Random();

        boolean rakNaGoreSvistnul = !false;
        while (rakNaGoreSvistnul) {
            try {
                index += random.nextInt(10);
                Thread.sleep(500);
                index -= random.nextInt(10);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
