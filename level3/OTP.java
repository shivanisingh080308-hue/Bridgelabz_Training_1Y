package com.gla.method.Level3;

public class OTP {
    static int otp() {
        return (int)(Math.random() * 900000) + 100000;
    }
    static boolean unique(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = otp();
        }
        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
        if (unique(a))
            System.out.println("All OTPs are unique");
        else
            System.out.println("Some OTPs are same");
    }
}