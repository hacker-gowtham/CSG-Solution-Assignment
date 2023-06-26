package Java.Polymorphism;

public class FixedAccount extends BankAccount{
    public FixedAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest is: " + balance * 0.08);
    }
    
}
