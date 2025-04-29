package java8features.practice;

@FunctionalInterface
interface Printer{
    void print(String message);
}
public class InterfaceExample {
    public static void main(String[] args) {
        Printer obj = System.out::println;
        obj.print("Printing");
    }
}
