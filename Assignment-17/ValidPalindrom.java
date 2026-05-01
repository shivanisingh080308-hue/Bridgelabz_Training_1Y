package Regex;

import java.util.Scanner;

public class ValidPalindrom {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        ValidPalindrom sol=new ValidPalindrom();
        boolean result=sol.isPalindrome(s);
        System.out.println("Result: " +result);
        sc.close();
    }

    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;

        while(i<j){
            while (i<j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
