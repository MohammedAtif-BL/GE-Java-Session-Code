package java8features.practice.advance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Longest3String {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alex", "christopher", "bob", "davidson", "evan");

        List<String> list = names.stream()
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .limit(3)
                .toList();


        System.out.println(list);
    }
}
