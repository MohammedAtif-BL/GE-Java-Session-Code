package example;

public class Account {
    String accountHolder;
    int balance;

    public Account(String accountHolder, int balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Deposited " + amount + " to " + accountHolder + "'s account.");
    }

    public void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrew " + amount + " from " + accountHolder + "'s account.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public void checkBalance(){
        System.out.println("Balance of " + accountHolder + "'s account: " + balance);
    }

}
