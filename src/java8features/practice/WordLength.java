package java8features.practice;

import java.util.Arrays;
import java.util.List;

public class WordLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cat");

        List<Integer> listLength = words.stream()
                .map(String::length)
                .toList();

        System.out.println(listLength);

    }
}
