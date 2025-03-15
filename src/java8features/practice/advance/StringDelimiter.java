package java8features.practice.advance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringDelimiter {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Delhi", "Mumbai", "Chennai");

        String cities1 = cities.stream()
                .collect(Collectors.joining(",", "Cities: ", ""));

        System.out.println(cities1);
    }
}
