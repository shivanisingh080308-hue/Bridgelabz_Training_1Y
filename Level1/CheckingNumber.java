import java .util.*;
public class CheckingNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double[] number = new double[10];
        double total=0.0;
        int index=0;
        while(true){
            System.out.println("Enter " + number.length + " number:");
            double value=sc.nextDouble();
            if(value<=0){
                break;
            }
            if(index==10){
                break;
            }
            number[index]=value;
            index++;
        }
        System.out.println("number entered");
        for(int i=0;i<index;i++){
            System.out.println(number[i]);
            total+=number[i];
        }
        System.out.println("total sum=" +total);
    }
}
