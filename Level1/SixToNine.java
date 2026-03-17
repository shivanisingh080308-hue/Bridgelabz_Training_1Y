
import java.util.*;
public class SixToNine{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number should be b/w 6 to 9");
        int num=sc.nextInt();
        int []table=new int[10];
        for(int i=1;i<=10;i++){
            if(num>=6 && num<=9){
                System.out.println(num+"x"+i+" = "+num*i);
            }
        }
    }
}
