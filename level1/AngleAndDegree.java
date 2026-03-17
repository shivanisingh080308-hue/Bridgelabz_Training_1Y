package com.gla.method.Level1;
import java.util.*;
public class AngleAndDegree {
    public static void Trig(double degree) {

        double radian = Math.toRadians(degree);

        double sinValue=Math.sin(radian);
        double cosValue=Math.cos(radian);
        double tanValue=Math.tan(radian);

        System.out.println("sin"+ sinValue);
        System.out.println("cos"+ cosValue);
        System.out.println("tan"+ tanValue);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        Trig(angle);
    }
}
