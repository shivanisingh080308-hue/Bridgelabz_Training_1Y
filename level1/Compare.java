
package com.gla.method.Level1;
import java.util.*;
public class Compare {
    public static int largest(int a,int b,int c){
        int largest=a;
        if(a>=b&&a>=c){
            System.out.println("num1 is the largest");
        }else if(b>=a&&b>=c){
            largest=b;
            System.out.println("num2 is largest");
        }else{
            System.out.println("num3 is largest");
            largest=c;
        }
        return largest;
    }
    public static int smallest(int a,int b,int c) {
        int smallest = a;
        if (a <= b && a <= c) {
            System.out.println("num1 is smallest");
        } else if (b <= a && b <= c) {
            smallest = b;
            System.out.println("num2 is smallest");
        } else {
            System.out.println("num3 is smallest");
            smallest = c;
        }
        return smallest;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number 1");
        int a=sc.nextInt();
        System.out.println("enter the number 2");
        int b=sc.nextInt();
        System.out.println("enter the number 3");
        int c=sc.nextInt();
        System.out.println("Largest number : "+largest(a,b,c));
        System.out.println("Smallest number : "+smallest(a,b,c));

    }
}