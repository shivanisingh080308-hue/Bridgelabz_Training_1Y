
package com.gla.method.Level1;
import java.util.*;
public class CheckNumber {
    public static void posNeg(int n){
        if(n>0){
            System.out.println("Positive");
        }else if(n<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        posNeg(n);
    }
}