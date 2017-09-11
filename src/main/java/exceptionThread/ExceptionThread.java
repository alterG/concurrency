package exceptionThread;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

public class ExceptionThread extends Thread {
    @Override
    public void run() {
        System.out.println("Exception googogo");
        throw new RuntimeException();
    }
}
