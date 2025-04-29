package java8features.lambdainterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<String,Integer> strLength = (str) -> str.length();

        System.out.println(strLength.apply("FUnction Interface "));
    }
}

//predicate -> test() -> return boolean -> 1 input
//consumer -> accept() -> return void -> 1 input
//supplier-> get() -> return value -> no input
//function -> apply() -> return value ->  1 input


