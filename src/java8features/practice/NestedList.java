package java8features.practice;

import java.util.Arrays;
import java.util.List;

public class NestedList {
    public static void main(String[] args) {
        List<List<String>> nested = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );


        List<String> list = nested.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(list);
    }
}
