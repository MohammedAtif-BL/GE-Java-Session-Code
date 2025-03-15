package exceptionhandling.uncheckedexception;

public class IllegalArgumentExample {
    public static void main(String[] args) {
        try {
            printAge(-5);
        } catch (IllegalArgumentException exception){
            System.out.println("Invalid argument: " + exception.getMessage());
        }
    }

    private static void printAge(int age) {
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("Age: "+age);
    }
}
