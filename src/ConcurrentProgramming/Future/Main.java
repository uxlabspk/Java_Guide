package ConcurrentProgramming.Future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // storing the result of callable in the future.
        Future<String> result = executorService.submit(new Calculation());

        try {
            System.out.println(result.get());
            executorService.shutdown();
        } catch (Exception e) {
            // if an exception occur we cancel the execution.
            result.cancel(true);
        }
    }
}