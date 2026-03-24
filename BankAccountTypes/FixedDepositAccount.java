
package BankAccountTypes;

public class FixedDepositAccount extends BankAccount{
    FixedDepositAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
