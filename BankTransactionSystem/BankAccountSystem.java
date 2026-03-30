package BankTransactionSystem;
import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}

public class BankAccountSystem {
    public void withdraw(double balance,double amount) throws InsufficientBalanceException,IllegalArgumentException{
        if(amount<0){
            throw new IllegalArgumentException("Invalid amount!");
        }
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance-=amount;
        System.out.println("Withdrawal successful, new balance : "+balance);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the balance of your account");
        double b=s.nextDouble();
        System.out.println("Enter the amount you want to withdraw");
        double w=s.nextDouble();
        BankAccountSystem obj=new BankAccountSystem();
        try{
            obj.withdraw(b,w);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e);
        }
        catch(IllegalArgumentException i){
            System.out.println(i);
        }
    }
}
