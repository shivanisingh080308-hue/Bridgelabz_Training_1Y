package BankAccountSimulation;

public class Runner {
    public static void main(String[] args){
        BankAccount premiumUser=new BankAccount("Michael","Premium",3500000.50);
        BankAccount regularUser=new BankAccount("Franklin","Regular",40000);
        BankAccount basicUser=new BankAccount("Trevor","Basic",2000);

        Thread t1=new Thread(premiumUser);
        Thread t2=new Thread(regularUser);
        Thread t3=new Thread(basicUser);

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}
