package Java.Encapluation;

public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setName("Raj");
        b.setAccountNumber(123456789);
        b.getDeatils();
        b.deposit(10000);
        b.getDeatils();
        b.withdraw(5000);
        b.getDeatils();

    

    }
    
}
