
package com.gla.method.Level1;
import java.util.*;
public class Chocolates {
    public static void divChoco(int choco,int children){
        if(children==0) {
            System.out.println("enter the non zero number");
            return;
        }
        int child= choco / children;
        int rem=choco % children;
        System.out.println("Each child gets: " + child);
        System.out.println("Remaining chocolates: " + rem);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of chocolates: ");
        int n = sc.nextInt();

        System.out.print("Enter total number of children: ");
        int m = sc.nextInt();

        divChoco(n,m);
    }
}