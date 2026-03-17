
import java.util.*;
public class Table{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        //array store
        int []table=new int[10];
        for(int i=1;i<=10;i++){
            table[i-1]=number*i;
        }
        for(int i=1;i<=10;i++){
            System.out.println(number +"*"+ i +"="+table[i-1]);
        }
    }
}