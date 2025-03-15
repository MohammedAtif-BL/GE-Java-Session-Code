package completablefuture;

import java.util.concurrent.CompletableFuture;

public class ChainingTransformations {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> 10)
                .thenApply(num -> num * 2)
                .thenApply(Object::toString)
                .thenAccept(System.out::println);
    }
}
