package com.gla.method.Level1;
import java.util.*;
public class Simple {
    public static double simpleInterest(double principle,double rate,double time){
        double si=(principle*rate*time)/100;
        return si;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle : ");
        double principle=sc.nextDouble();
        System.out.print("Enter rate : ");
        double rate=sc.nextDouble();
        System.out.print("Enter time : ");
        double time=sc.nextDouble();

        double result = simpleInterest(principle,rate,time);
        System.out.println("The simple interest : "+result);
    }
}