
package BankAccountTypes;

public class Main {
    public static void main(String[] args){
        SavingsAccount s=new SavingsAccount(1234,1000,5);
        CheckingAccount c=new CheckingAccount(4567,500,300);
        FixedDepositAccount f=new FixedDepositAccount(78910,2000);
        System.out.println("-----Account 1-----");
        s.displayDetails();
        s.displayAccountType();
        s.calculateInterest();
        System.out.println("-----Account 2-----");
        c.displayDetails();
        c.displayAccountType();
        c.withdraw(100);
        c.withdraw(500);
        System.out.println("-----Account 3-----");
        f.displayDetails();
        f.displayAccountType();
    }
}
