package java8features.lambdaninterface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> upperString = (str) -> System.out.println(str.toUpperCase());

        upperString.accept("hello");
    }
}
