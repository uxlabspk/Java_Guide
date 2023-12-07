package ConcurrentProgramming.Future;

import java.util.concurrent.Callable;

// implements Callable interface of type String.
public class Calculation implements Callable<String> {
    @Override
    public String call() throws Exception {
        // sleep for 2 seconds.
        Thread.sleep(2000);
        return "Result";
    }
}