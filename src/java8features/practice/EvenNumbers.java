package java8features.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> collect = list.stream()
                .filter(n -> n % 2 == 0)
                .map(s -> s * s)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
