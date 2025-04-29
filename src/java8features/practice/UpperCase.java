package java8features.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "jane", "doe");

        names.forEach(str-> System.out.println(str.toUpperCase()));

    }
}
