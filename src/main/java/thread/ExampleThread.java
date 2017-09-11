package thread;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

public class ExampleThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("priority is " + this.getPriority());
            System.out.println("name is " + this.getName());
            System.out.println("one second passed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
