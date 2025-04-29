package java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample {
    //Intermediate Operations
    // Build processing steps and return a new stream
    // filter, map, sorted, distinct, limit, skip

    //Terminal Operations
    // Process the stream and return a result
    // forEach, collect, reduce, min, max, count, anyMatch, allMatch, noneMatch, FindFirst, FindAny
    public static void main(String[] args) {
        String name = "Hello";
        List<Integer> list = Arrays.asList(5,1,2, 9, 1,8, 3, 7, 9, 2,8);

        int sum =1;
        for (Integer num : list){
            sum +=num;
        }

        // 1. disctinct()
        System.out.println("Distinct Elements: ");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        //2. filter()
        System.out.println("Filter Method");
        list.stream()
                .filter(number -> number > 5)
                .forEach(System.out::println);

        //3.map()
        System.out.println("Multiple of 2 using map(): ");
        list.stream()
                .map(n -> n *2)
                .forEach(System.out::println);

        //4. sorted()
        System.out.println("Sort the List: ");
        list.stream()
                .sorted()
                .forEach(System.out::println);

        // 5. limit()
        System.out.println("use of Limit method: ");
        list.stream()
                .limit(3)
                .forEach(System.out::println);

        //6. skip()
        System.out.println("Use of Skip():");
        list.stream()
                .skip(3)
                .forEach(System.out::println);

        //7 reduce()
        System.out.println("Use of Reduce: ");
//        int resukt = 0;
        Integer result = list.stream()
                .reduce(1, (a, b) -> a + b);
        System.out.println(result);


        //9.collect()
        System.out.println("Use of Collect: ");
        Set<Integer> collect = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(collect);

        //8.FindFirst()
        System.out.println("FInd first:");
        Optional<Integer> first = list.stream()
                                         .findFirst();

        first.ifPresent(System.out::println);

        //Stream Operations
        List<Integer> sortedList = list.stream()
                .distinct()
                .filter(n -> n > 4)
                .map(n -> n * 2)
                .sorted()
                .toList();

        System.out.println(sortedList);


    }
}
