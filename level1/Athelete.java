
package com.gla.method.Level1;
import java.util.*;
public class Athelete {
    public static double triangle(double x,double y,double z){
        int distance=5000;
        double rounds = distance/(x+y+z);
        return rounds;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x :");
        double x = sc.nextDouble();
        System.out.print("Enter y :");
        double y = sc.nextDouble();
        System.out.print("Enter z :");
        double z = sc.nextDouble();

        System.out.println("Round must be completed by athlete : "+triangle(x,y,z));

    }
}