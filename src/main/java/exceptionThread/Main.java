package exceptionThread;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExceptionThread exceptionThread = new ExceptionThread();
        exceptionThread.start();
        exceptionThread.join();
        System.out.println("I am working, mne poh");
    }
}
