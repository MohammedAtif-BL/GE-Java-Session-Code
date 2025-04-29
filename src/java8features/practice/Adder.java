package java8features.practice;

@FunctionalInterface
public interface Adder {
    int add(int a, int b);
}

class AdderImpl{
    public static void main(String[] args) {
        Adder addObj = (a,b) -> a + b;
        System.out.println(addObj.add(10,20));
    }
}
