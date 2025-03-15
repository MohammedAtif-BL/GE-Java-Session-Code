package java8features.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FIndDuplicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "jane", "jack", "john", "jack", "jill");

        List<String> list = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(l -> l.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list);
    }
}
