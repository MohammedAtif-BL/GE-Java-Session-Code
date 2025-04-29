package java8features.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUpperCase {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "avocado", "cherry");

        List<String> stringList = fruits.stream()
                .filter(f -> f.startsWith("a"))
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(stringList   );
    }
}
