package com.gla.method.Level1;
import java.util.*;
public class NaturalNumber {
    public static int naturalNumber(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.println("Natural number : "+naturalNumber(n));
    }
}