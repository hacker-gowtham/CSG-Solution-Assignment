package Java.Polymorphism;

public class BankAccount {
   double balance;

   public BankAccount(double balance) {
       this.balance = balance;
   }

   public void calculateInterest() {
       System.out.println("Interest is: " + balance * 0.05);
   }
    
}
