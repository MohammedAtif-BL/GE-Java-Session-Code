package java8features.lambdaninterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> isLongString = (str) -> str.length()> 5;

        System.out.println(isLongString.test("Hello"));
        System.out.println(isLongString.test("Hello World"));
    }
}
