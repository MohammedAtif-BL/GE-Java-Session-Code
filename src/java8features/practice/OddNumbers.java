package java8features.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6 );

        List<Integer> oddNumbers = list.stream()
                .filter(f -> f % 2 != 0)
                .map(n -> n * 3)
                .collect(Collectors.toList());

        System.out.println(oddNumbers);
    }
}
