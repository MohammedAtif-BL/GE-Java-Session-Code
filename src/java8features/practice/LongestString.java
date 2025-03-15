package java8features.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LongestString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java", "springboot", "microservices", "api", "rest");

        Optional<String> max = strings.stream()
                .max(Comparator.comparingInt(str -> str.length()));

        System.out.println(max.orElse("String not found"));


    }
}
