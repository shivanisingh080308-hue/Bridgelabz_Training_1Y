package Assignmeny14;
import java.util.Scanner;
public class UserInputValidation {
    public static boolean checkAge(String age){
        try{
            int ans=Integer.parseInt(age);
            if(ans>=18){
                return true;
            }
        }
        catch(NumberFormatException n){
            return false;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age for verification");
        String a=s.nextLine();
        boolean res=checkAge(a);
        System.out.println("true : verified , false : not verified");
        System.out.println("Result : "+res);
    }
}
