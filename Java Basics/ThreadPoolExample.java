//Thread pool executor 
import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Creating a fixed-size thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Creating two Runnable tasks using lambda expressions
        Runnable task1 = () -> System.out.println("Executing Task1");
        Runnable task2 = () -> System.out.println("Executing Task2");

        // Submitting tasks to the thread pool for execution
        executor.execute(task1);
        executor.execute(task2);

        // Shutting down the thread pool after tasks are completed
        executor.shutdown();
    }
}
