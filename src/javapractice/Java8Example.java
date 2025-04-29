package javapractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Example {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = nums.stream()
                .filter(num -> num % 2 != 0)
                .map(s -> s * s)
                .toList();

        System.out.println(result);

        List<List<String>> nested = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D")
        );

        nested.stream().flatMap(Collection::stream)
                .forEach(System.out::print);

    }
}
