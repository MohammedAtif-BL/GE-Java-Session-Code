package java8features.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("asdfsfds","asdfd","asds","sdfg","sdffsd");

        List<String> stringList = list.stream()
                .filter(f -> f.length() > 5)
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(stringList);
    }
}
