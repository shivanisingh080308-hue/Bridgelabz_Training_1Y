package Regex;

import java.util.Scanner;

public class StringPalindrom {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        StringPalindrom sol=new StringPalindrom();
        boolean result=sol.validPalindrome(s);
        System.out.println("Result: "+result);
        sc.close();
    }

    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;

        while(i<j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1);
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome(String s, int i, int j) {
        while(i<j) {
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
