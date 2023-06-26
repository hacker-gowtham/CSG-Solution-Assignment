package Java.Encapluation;

public class BankAccount {
    private String name;
    private int balance=0;
    private int accountNumber;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void getDeatils(){
        System.out.println("========================Deatils==========================");
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
        System.out.println("==========================================================");
    }

    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
        }
        
    }

    public void withdraw(int amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            
        }
       
        else{
            System.out.println("Insufficient balance");
        }

    }
    

    
}
