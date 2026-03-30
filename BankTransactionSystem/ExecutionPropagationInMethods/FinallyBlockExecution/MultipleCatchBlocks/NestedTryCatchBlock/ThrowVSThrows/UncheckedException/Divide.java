
package UncheckedException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;
public class Divide {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Enter the first number");
            int n1=s.nextInt();
            System.out.println("Enter the second number");
            int n2=s.nextInt();
            int result=n1/n2;
            System.out.println("The code has no exception");
            System.out.println("Result of the division is : "+result);
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }

        finally{
            System.out.println("Checked for Exception in the code");
        }
    }
}
