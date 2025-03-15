package exceptionhandling.checkedexception;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("Test");
            System.out.println("Class Found");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found: "+e.getMessage());
        }
    }
}
