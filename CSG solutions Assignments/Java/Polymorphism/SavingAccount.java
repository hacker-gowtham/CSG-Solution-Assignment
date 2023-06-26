package Java.Polymorphism;

public class SavingAccount extends BankAccount {
    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest is: " + balance * 0.05);
    }
    
}
