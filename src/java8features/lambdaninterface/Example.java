package java8features.lambdaninterface;

public class Example {
    public static void main(String[] args) {
        // syntax of lambda expression

        // (parameters) -> {Boby}

        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Running");
            }
        };

        Runnable runObj = () -> {
            System.out.println("Runnable Interface using Lambda Expression");
        };
    }
}
