package Java.Polymorphism;

public class Main {
       public static void main(String[] args) {
            BankAccount account1 = new SavingAccount(10000);
            BankAccount account2 = new FixedAccount(50000);
            account1.calculateInterest();
            account2.calculateInterest();
        }       
}
