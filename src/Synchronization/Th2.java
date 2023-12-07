package Synchronization;

// Another thread class
public class Th2 extends Thread {
    Multiple m = null;
    // parameterized constructor
    public Th2(Multiple m) {
        this.m = m;
    }

    // Overridden run method
    @Override
    public void run() {
        m.Multiply(3);
    }
}