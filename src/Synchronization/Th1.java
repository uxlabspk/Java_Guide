package Synchronization;

// Thread class
public class Th1 extends Thread {
    Multiple m = null;
    // Parametrized constructor
    public Th1(Multiple m) {
        this.m = m;
    }

    // overridden run method
    @Override
    public void run() {
        m.Multiply(2);
    }
}