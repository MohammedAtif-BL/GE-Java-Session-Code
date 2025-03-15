package exceptionhandling;

public class ExceptionExample {
    public static void main(String[] args) {
        int num = 0;
        try {
            num = 50 / 0;
            System.out.println(num);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e1){
            System.out.println(e1.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Hello World");
    }
}
