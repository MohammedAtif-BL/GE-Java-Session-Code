package java8features.practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountChar {
    public static void main(String[] args) {
        String input = "programming";

        Map<Character, Long> collect = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

    }
}
