package java8features.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Example {
    // ClassName::methodName
    //or
    //objectName::methodName

    //1. Reference to a static method
    //2. Reference to an instance method of a particular object
    //3. Reference to an instance method of an arbitrary object of a particular type
    //4. Reference to a constructor
    
    private String name;

    public Example(String name) {
        this.name = name;
    }

    public static void printMessage(){
        System.out.println("Hello from static method");
    }

    public void printSomething(){
        System.out.println("Print something");
    }

    public static void main(String[] args) {
        //Using lambda expression
//        Runnable runnable = () -> Example.printMessage();
//        runnable.run();
//
//        //Using method reference
//        Runnable printMessage = Example::printMessage;
//        printMessage.run();
//
//        //Using lambda expression
//        Example example = new Example();
//        Runnable runnable1 = () -> example.printSomething();
//        runnable1.run();
//
//        //Using method reference
//        Runnable r2 = example::printSomething;
//        r2.run();
//
//        List<String> names = Arrays.asList("ABC", "XYZ", "ASD", "TEST");
//
//        //Lambda Expression
//        names.forEach(name -> System.out.println(name));
//
//        //Method reference
//        names.forEach(System.out::println);
//
//        //Using lambda expression
//        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
//
//        //Method reference
//        Collections.sort(names, String::compareTo);
//
//        //Lambda Expression
//        Function<String, Example> obj1 =obj -> new Example(obj);
//        Example o1 = obj1.apply("Hello");
//
//        //method reference
//        Function<String, Example> obj2 = Example::new;
//        Example o2 = obj2.apply("Hello");

        Optional<String> optionalObject = Optional.ofNullable(null);

        System.out.println(optionalObject.orElse("Default"));
        System.out.println(optionalObject.orElseGet(()-> "Generated"));
        System.out.println(optionalObject.orElseThrow(()-> new RuntimeException("No Value")));
    }
}
