package exceptionhandling;

public class NestedTryBlockExample {
    public static void main(String[] args) {
        try {
            //Outer Try block
            int[] numbers = {1,2,3};
            try{
                //Inner try block 1
                int result = numbers[1] / 0;
            } catch (ArithmeticException exception){
                System.out.println(exception.getMessage());
            }

            try {
                // Inner try block 2
                System.out.println(numbers[4]);
            } catch (ArrayIndexOutOfBoundsException exception){
                System.out.println(exception.getMessage());
            }

            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException exception){
                System.out.println(exception.getMessage());
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }


        // Outer try block
        System.out.println("End of program");

    }
}
