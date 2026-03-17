package com.gla.method.Level1;
import java.util.*;
public class SpringSeason {
    public static boolean isSpring(int month,int day) {
        if ((month == 3 && day >= 20 && day <= 31) ||
                (month == 4 && day >= 1 && day <= 30) ||
                (month == 5 && day >= 1 && day <= 31) ||
                (month == 6 && day >= 1 && day <= 20)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month");
        int month=sc.nextInt();
        System.out.println("enter the day");
        int day=sc.nextInt();
        if (isSpring(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}