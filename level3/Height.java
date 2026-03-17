package com.gla.method.Level3;
import java.util.*;
public class Height {
    static int Sum(int[] h) {
        int sum = 0;
        for (int i = 0; i < h.length; i++) {
            sum = sum + h[i];
        }
        return sum;
    }

    static double Mean(int[] h) {
        return (double) Sum(h) / h.length;
    }

    static int Shortest(int[] h) {
        int min = h[0];
        for (int i = 1; i < h.length; i++) {
            if (h[i] < min) {
                min = h[i];
            }
        }
        return min;
    }

    static int Tallest(int[] h) {
        int max = h[0];
        for (int i = 1; i < h.length; i++) {
            if (h[i] > max) {
                max = h[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] heights = new int[11];

        System.out.println("Enter heights of 11 players (in cm):");

        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextInt();
        }

        System.out.println("Sum = " + Sum(heights));
        System.out.println("Mean = " + Mean(heights));
        System.out.println("Shortest = " + Shortest(heights));
        System.out.println("Tallest = " + Tallest(heights));
    }

}