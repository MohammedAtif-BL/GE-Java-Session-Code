package exceptionhandling.throwexample;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            int result = 10 /20;
            System.out.println(result);
            if(result == 0){
                throw new IllegalArgumentException("Result is zero");
            }
        } catch (ArithmeticException exception){
            System.out.println("Exception caught: " + exception.getMessage());
        } catch (IllegalArgumentException exception){
            System.out.println("Exception caught: " + exception.getMessage());
        }
    }

    private static void divide(int num1, int num2) {
        if(num2 == 0){
            throw new ArithmeticException("Number cannot be divided by zero");
        }
        System.out.println("Result: "+(num1/num2));
    }
}
