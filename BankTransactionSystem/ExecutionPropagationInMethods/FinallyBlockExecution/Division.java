
package FinallyBlockExecution;
import java.util.Scanner;
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter the first number");
            int a = s.nextInt();
            System.out.println("Enter the second number");
            int b = s.nextInt();
            int result=a/b;
            System.out.println("Division of the numbers is : "+result);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        finally{
            System.out.println("Operation Completed");
        }
    }
}
