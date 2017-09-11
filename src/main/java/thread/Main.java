package thread;

import thread.ExampleThread;
import thread.exampleThread2nd;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("MyPersonalThreads");
        ExampleThread exampleThread = new ExampleThread();
        Thread exampleThread2 = new Thread(threadGroup, new exampleThread2nd());
        exampleThread.start();
        exampleThread2.start();
        exampleThread.join();
        exampleThread2.join();
        System.out.println("Thats end");
    }
}
