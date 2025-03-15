package completablefuture;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class ErrorHandling {
    public static void main(String[] args) {
        
        CompletableFuture<String> result = CompletableFuture.supplyAsync(() -> {
            Random random = new Random();
            if (random.nextBoolean()) {
                throw new RuntimeException("Oops! Something went wrong");
            }
            return "Success";
        }).exceptionally(ex -> {
            System.err.println(ex.getMessage());
            return "Error";
        });

        System.out.println(result.join());
    }
}
