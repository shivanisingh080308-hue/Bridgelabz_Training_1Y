
package com.gla.method.Level2;
import java.util.*;
public class LeapYear {
    static void  leapCheck(int a) {
        if (a % 4 == 0 || a % 400 == 0) {
            System.out.println("its leap year");
        } else if (a % 100 != 0) {
            System.out.println("ist not leap year");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
        int a=sc.nextInt();
        leapCheck(a);

    }
}