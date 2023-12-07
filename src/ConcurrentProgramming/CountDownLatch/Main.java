package ConcurrentProgramming.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        try {
            int numOfThreads = 10;
            CountDownLatch latch = new CountDownLatch(numOfThreads);

            for (int i = 0; i < numOfThreads; i++) {
                new Thread(new PrintingThread(latch)).start();
            }
            latch.await();
            System.out.println("After completing " + numOfThreads + " threads in main.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}