package abstraction;

interface Payment {
    int number = 100;
    void processPayment(double amount);

    void refund(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded $" + amount + " from credit card payment.");
    }
}

class UPIPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded $" + amount + " from UPI payment.");
    }
}
