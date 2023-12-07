package MultiThreading;

// Main example class
public class Main {
    // main Method
    public static void main(String[] args) {
        // Creating object of Runnable implementation class.
        Thread th1 = new Thread(new Thread1());
        th1.start();

        // Creating object of Thread extending class.
        Thread2 th2 = new Thread2();
        th2.start();
    }
}