package java8features.practice.advance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FlattenSort {
    public static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(3, 5, 1),
                Arrays.asList(4, 2),
                Arrays.asList(9, 6)
        );

        List<Integer> list = numbers.stream()
                .flatMap(List::stream)
                .sorted(Comparator.comparingInt(Integer::intValue))
                .toList();

        System.out.println(list);

    }
}
