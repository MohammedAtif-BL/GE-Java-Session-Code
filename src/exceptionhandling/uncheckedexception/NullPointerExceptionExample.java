package exceptionhandling.uncheckedexception;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException exception){
            System.out.println("NullPointerException caught:" + exception.getMessage());
        }
    }
}
