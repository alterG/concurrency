package thread;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

public class exampleThread2nd implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);
//            System.out.println("group is " + this.);
            System.out.println("Runnale thread working");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
