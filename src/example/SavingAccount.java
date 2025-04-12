package example;

public class SavingAccount extends Account{
    double interestRate;

    public SavingAccount(String accountHolder, int balance, double interestRate){
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        System.out.println("Interest added to " + accountHolder + "'s account.");
    }
}

