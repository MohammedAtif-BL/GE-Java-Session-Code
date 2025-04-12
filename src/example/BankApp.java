package example;

public class BankApp {
    public static void main(String[] args) {
        Account account = new Account("Holder1", 1000);
        account.deposit(500);
        account.withdraw(300);
        account.checkBalance();

        SavingAccount holder2 = new SavingAccount("Holder2", 2000, 2.5);
        holder2.deposit(500);
        holder2.addInterest();
        holder2.checkBalance();

        if(holder2 instanceof Account){
            System.out.println("holder2 is an instance of Account.");
        } else {
            System.out.println("holder2 is not an instance of Account.");
        }

    }
}
