package ConcurrentProgramming.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class PrintingThread implements Runnable {
    CountDownLatch latch;
    // parametrized constructor
    public PrintingThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println("Printing...");
            latch.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}