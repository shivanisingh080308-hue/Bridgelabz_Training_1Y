package MultipleCatchBlocks;
import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        try{
            int[] num=new int[5];
            System.out.println("Enter 5 integers");
            for(int i=0;i<5;i++){
                num[i]=s.nextInt();
            }
            System.out.println("Enter the index that you wan the value of");
            int index=s.nextInt();
            int result=num[index];
            System.out.println("Result of the Array Operation is : "+result);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a.getMessage());
        }
        catch(NullPointerException n){
            System.out.println(n.getMessage());
        }
        finally{
            System.out.println("Checked for exception in this code");
        }
    }
}
