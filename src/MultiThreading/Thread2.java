package MultiThreading;

// class extending the Thread class, which also implements the Runnable interface.
public class Thread2 extends Thread {
    // Overriding the run method.
    @Override
    public void run() {
        System.out.println("Thread 2 class run() is running");
    }
}