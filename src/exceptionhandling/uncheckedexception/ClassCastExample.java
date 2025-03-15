package exceptionhandling.uncheckedexception;

public class ClassCastExample {
    public static void main(String[] args) {
        try{
            Object obj = "123";
            Integer num = (Integer) obj;
            System.out.println(num);
        } catch (ClassCastException exception){
            exception.printStackTrace();
        }
    }
}
