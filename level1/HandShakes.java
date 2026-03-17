
package com.gla.method.Level1;
import java.util.*;
public class HandShakes {
    public static int handshakes(int n){
        int max=(n*(n-1))/2;
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the people ");
        int n=sc.nextInt();
        System.out.println("Maximum number of possible handshakes :"+handshakes(n));
    }
}