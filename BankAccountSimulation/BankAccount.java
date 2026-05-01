package BankAccountSimulation;

public class BankAccount implements Runnable {
    private String accountName;
    private String accountType;
    private double balance;

    public BankAccount(String accountName, String accountType, double balance) {
        this.accountName = accountName;
        this.accountType = accountType;
        this.balance = balance;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                System.out.println("User Name : " + accountName);
                System.out.println("Account Type : " + accountType);
                System.out.println("Checking Balance (" + i + ") ...");
                System.out.println("Current Balance is : " + balance);
                System.out.println("---------------------------------------");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
