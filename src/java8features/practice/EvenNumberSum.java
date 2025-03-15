package java8features.practice;

import java.util.Arrays;
import java.util.List;

public class EvenNumberSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        Integer sum;
        sum = list.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
