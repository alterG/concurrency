package atomic.two;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

public class Incrementor extends Thread {
    AtomicInteger x;

    public Incrementor(AtomicInteger x) {
        this.x = x;
    }

    private void incement() {
        x.incrementAndGet();
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                incement();
                System.out.println(x);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
