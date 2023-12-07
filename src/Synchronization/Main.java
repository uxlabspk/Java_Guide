package Synchronization;

// main example class
public class Main {
    // main driven method
    public static void main(String[] args) {
        // creating the object of Multiple class.
        Multiple m = new Multiple();

        // Starting the th1 and th2 threads.
        new Th1(m).start();
        new Th2(m).start();
    }
}