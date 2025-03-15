package java8features.practice.advance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByVowelCount {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "grape", "orange");

        List<String> list = words.stream()
                .sorted(Comparator.comparingInt(SortByVowelCount::countVowel).reversed())
                .toList();

        System.out.println(list);
    }

    private static int countVowel(String s) {
        return (int) s.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}
