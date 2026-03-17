
import java.util.*;
public class Factor{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int number=sc.nextInt();
        int size=10;
        int[]factor=new int[size];
        int index=0;

        for(int i=1;i<=number;i++){
            if(number%i==0){
                if(index==size){
                    size=size*2;
                    int[]newArray=new int[size];

                    for(int j=0;j<factor.length;j++){
                        newArray[j]=factor[j];
                    }
                    factor=newArray;
                }
                factor[index]=i;
                index++;

            }
        }
        System.out.println("factor are:-");
        for(int i=0;i<index;i++){
            System.out.println(factor[i]+" ");
        }
    }
}