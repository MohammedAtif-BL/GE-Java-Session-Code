package exceptionhandling.uncheckedexception;

public class ArrayIndexOutOfBoundExample {
    public static void main(String[] args) {
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array index out of bounds: " + exception.getMessage());
        } catch (Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
