package com.gla.method.Level2;
import java.util.*;
public class UnitConvector {
    public static double kmToMiles(double km){
        double km2miles = 0.621371;
        return km*km2miles;
    }
    public static double milesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double meterToFeet(double meters){
        double meters2feet = 3.28084;
        return meters* meters2feet;
    }
    public static double feetToMeter(double feet){
        double feet2meters = 0.3048;
        return feet*feet2meters;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();
        System.out.println("Miles: " +UnitConvector.kmToMiles(km));

        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        System.out.println("Kilometers: " + UnitConvector.milesToKm(miles));

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println("Feet: " + UnitConvector.meterToFeet(meters));

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.println("Meters: " + UnitConvector.feetToMeter(feet));
    }
}