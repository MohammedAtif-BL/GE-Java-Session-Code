package java8features.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear", "kiwi", "plum", "grape");
        Map<Integer, List<String>> collect = words.stream()
                .collect(Collectors.groupingBy(word -> word.length()));

        System.out.println(collect);
    }
}
