package thread;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

public class ExampleThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("one second passed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
