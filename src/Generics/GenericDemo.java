package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Generic Class
class Box<T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

//Generic Method
class Util{
    public static <T> void printList(List<T> list){
        for (T item : list){
            System.out.print(item+" ");
        }
        System.out.println();
    }

    //Bounded Generic method
    public static <T extends Number> double square(T number){
        return number.doubleValue() * number.doubleValue();
    }

    //WildCard Example - upper Bounded
    public static void printNumbers(List<? extends Number> list){
        for (Number number : list){
            System.out.print(number+" ");
        }
        System.out.println();
    }

    //WildCard Example - lower Bounded
    public static void addInteger(List<? super Integer> list){
        list.add(10);
        list.add(20);
    }
}

//Generic Interface
interface Calculator<T>{
    T add(T a, T b);
}

class IntegerCalculator implements Calculator<Integer>{
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}

//Multiple Generic Parameters
class Pair<K, V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}

public class GenericDemo {
    public static void main(String[] args) {
        Box<String> strBox = new Box<>();
        strBox.setValue("Generic String ");

        System.out.println(strBox.getValue());

        Box<Integer> intBox = new Box<>();
        intBox.setValue(10);

        System.out.println(intBox.getValue());

        //Generic Method
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        Util.printList(intList);
        List<String> names = List.of("Alice", "Bob", "Charlie");
        Util.printList(names);

        //Bounded Generic method
        System.out.println("Square of 4: " + Util.square(4));

        //WildCard Example - upper Bounded
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Util.printNumbers(list);

        //Lower  Bounded Wildcard
        List<Number> numList = new ArrayList<>();
        Util.addInteger(numList);
        System.out.println("After adding integers: " + numList);

        //Generic Interface
        Calculator<Integer> intCalculator = new IntegerCalculator();

        System.out.println("Sum: " + intCalculator.add(5, 3));

        //Multiple Generic Parameters
        Pair<String, Integer> pair = new Pair<>("Alice", 25);
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());
    }
}
