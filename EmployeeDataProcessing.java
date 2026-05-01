package Assignmeny14;
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeDataProcessing {
    public static void intToInteger(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n=s.nextInt();
        int[] age=new int[n];
        System.out.println("Enter the employee ages");
        for(int i=0;i<n;i++){
            age[i]=s.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            Integer a=age[i];
            list.add(a);
        }
        System.out.println("The ages of the employees are");
        System.out.println(list);
    }

    public static void main(String[] args){
        intToInteger();
    }
}

