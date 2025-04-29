package java8features.lambdainterface;

@FunctionalInterface
public interface Calculator {
    int operate(int num1,int num2);

    default void show(){
        System.out.println("Functional interface");
    }
}
