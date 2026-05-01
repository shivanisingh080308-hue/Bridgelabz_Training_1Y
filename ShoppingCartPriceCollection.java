package Assignmeny14;
import java.util.Scanner;
public class ShoppingCartPriceCollection {
    public static int convertInput(String s){
        try{
            return Integer.parseInt(s);
        }
        catch(NumberFormatException n){
            System.out.println(n.getMessage());
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the price");
        String input=s.nextLine();
        int result=convertInput(input);
        System.out.println("Total Price : "+result);
    }
}
