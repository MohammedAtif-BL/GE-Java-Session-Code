package completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");
        System.out.println(future.get()); // Output: Hello

        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            System.out.println("Running async task");
        });
        future1.get(); // Wait for completion

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply(str -> str + " World");
        System.out.println(future2.get()); // Output: Hello World

        CompletableFuture.supplyAsync(() -> "Java")
                .thenAccept(result -> System.out.println("Result: " + result));

        CompletableFuture.supplyAsync(() -> 42)
                .thenRun(() -> System.out.println("Task finished"));


        CompletableFuture<String> futuree = CompletableFuture.supplyAsync(() -> {
            if (false) throw new RuntimeException("Error");
            return "Success";
        }).exceptionally(ex -> "Recovered from error");

        System.out.println(futuree.get()); // Output: Recovered from error


        CompletableFuture<String> futureh = CompletableFuture.supplyAsync(() -> {
            if (false) throw new RuntimeException("Fail");
            return "OK";
        }).handle((res, ex) -> {
            if (ex != null) return "Error handled";
            return res;
        });
        System.out.println(futureh.get()); // Output: Error handled

    }
}
