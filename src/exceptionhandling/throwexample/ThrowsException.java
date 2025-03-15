package exceptionhandling.throwexample;

import java.io.IOException;

public class ThrowsException {

    public static void main(String[] args) {
        try {
            methodWithThrows();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void methodWithThrows() throws IOException {
        throw new IOException("Example IOExcetion");
    }
}
