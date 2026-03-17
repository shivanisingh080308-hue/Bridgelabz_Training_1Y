
import java.util.*;
public class Bones{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=10;
        double[]salary=new double[n];
        double[]service=new double[n];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for(int i=0;i<n;i++){
            System.out.println("employee"+(i+1));
            System.out.println("salary");
            salary[i]=sc.nextDouble();
            System.out.println("year of service");
            service[i]=sc.nextDouble();
            if(salary[i]<=0||service[i]<0){
                System.out.println("invalid input,enter again");
                i--;

            }
        }
        for (int i = 0; i < n; i++) {
            double bonus;
            if (service[i] > 5) {
                bonus = salary[i] * 0.05;
            } else {
                bonus = salary[i] * 0.02;
            }
            totalBonus = totalBonus + bonus;
            totalOldSalary = totalOldSalary + salary[i];
            totalNewSalary = totalNewSalary + salary[i] + bonus;
        }
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}