package java8features.practice;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String name = null;  // Initialize name as null
        Optional<String> optionalName = Optional.ofNullable(name);

        optionalName.ifPresentOrElse(System.out::println, () -> System.out.println("Name is null"));
    }
}
