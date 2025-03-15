package exceptionhandling.customexception;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try{
            validateAge(15);
        } catch (InvalidAgeException exception){
            System.out.println(exception.getMessage());
        }
    }

    private static void validateAge(int age) {
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 or above");
        }else {
            System.out.println("Age is valid");
        }
    }
}
