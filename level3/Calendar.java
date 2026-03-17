package com.gla.method.Level3;
import java.util.*;
public class Calendar {
    static String monthName(int m) {
        String[] a = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        return a[m - 1];
    }
    static boolean leap(int y) {
        if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
            return true;
        else
            return false;
    }
    static int days(int m, int y) {
        int[] d = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && leap(y))
            return 29;
        return d[m - 1];
    }
    static int firstDay(int m, int y) {
        int d = 1;
        if (m < 3) {
            m = m + 12;
            y = y - 1;
        }
        int k = y % 100;
        int j = y / 100;
        int f = d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j;
        return f % 7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(monthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int start = firstDay(m, y);
        int total = days(m, y);
        for (int i = 0; i < start; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= total; i++) {
            System.out.printf("%3d ", i);
            if ((i + start) % 7 == 0)
                System.out.println();
        }
    }
}