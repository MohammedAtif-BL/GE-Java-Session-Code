package abstraction;

public class PaymentMain {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment(1000);

        Payment upiPayment = new UPIPayment();
        upiPayment.processPayment(1500);
    }
}
