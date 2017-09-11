import thread.ExampleThread;
import thread.exampleThread2nd;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

public class Main {
    public static void main(String[] args) {
        ExampleThread exampleThread = new ExampleThread();
        exampleThread.start();
        Thread exampleThread2 = new Thread(new exampleThread2nd());
        exampleThread2.start();
    }
}
