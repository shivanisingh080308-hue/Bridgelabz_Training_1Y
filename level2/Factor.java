package com.gla.method.Level2;
import java.util.*;
public class Factor {
    public static int[] findFactor(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        int[] f=new int[count];
        int j=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                f[j]=i;
                j++;
            }
        }
        return f;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number");
        int n=sc.nextInt();
        int []factors=findFactor(n);
        int sum = 0, product = 1;
        double squareSum = 0;
        System.out.println("Factor are:");
        for(int i=0;i<factors.length;i++){
            System.out.println(factors[i]+" ");
            sum += factors[i];
            product *= factors[i];
            squareSum += Math.pow(factors[i], 2);
        }
        System.out.println("\nSum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Sum of squares = " + squareSum);

    }
}