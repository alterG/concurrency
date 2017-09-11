package atomic.two;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

public class Main {
    public static void main(String[] args) {
        AtomicInteger x = new AtomicInteger();
        Incrementor thread1 = new Incrementor(x);
        Incrementor thread2 = new Incrementor(x);
        thread1.start();
        thread2.start();
    }
}
