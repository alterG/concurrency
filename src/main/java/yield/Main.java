package yield;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 * doesn't work :)
 */

public class Main {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println("Thread 1 started");
                Thread.yield();
                System.out.println("Thread 1 ended");
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                System.out.println("Thread 2 started");
                System.out.println("Thread 2 ended");
            }
        }.start();
    }


}
