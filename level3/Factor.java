package com.gla.method.Level3;
import java.util.*;
public class Factor {
    static int[] factors(int n) {
        int c = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        int[] a = new int[c];
        int j = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                a[j] = i;
                j++;
            }
        }
        return a;
    }

    static int max(int[] a) {
        int m = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        return m;
    }
    static int sum(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s = s + a[i];
        }
        return s;
    }
    static int prod(int[] a) {
        int p = 1;
        for (int i = 0; i < a.length; i++) {
            p = p * a[i];
        }
        return p;
    }
    static double cubeProd(int[] a) {
        double p = 1;
        for (int i = 0; i < a.length; i++) {
            p = p * Math.pow(a[i], 3);
        }
        return p;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = factors(n);

        System.out.print("Factors: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nGreatest factor: " + max(a));
        System.out.println("Sum of factors: " + sum(a));
        System.out.println("Product of factors: " + prod(a));
        System.out.println("Product of cube of factors: " + cubeProd(a));
    }
}