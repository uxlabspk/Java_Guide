package MultiThreading;

// class implementing the Runnable interface.
public class Thread1 implements Runnable {
    // Overriding the run method
    @Override
    public void run() {
        System.out.println("Thread 1 class run() is running");
    }
}
