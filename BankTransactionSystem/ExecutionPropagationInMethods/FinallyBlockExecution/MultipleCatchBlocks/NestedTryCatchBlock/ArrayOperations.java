package NestedTryCatchBlock;
import java.util.Scanner;
public class ArrayOperation{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int l = s.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter the array");
        for (int i = 0; i < l; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the index of the element from the array");
        int index = s.nextInt();
        System.out.println("Enter the divisor");
        int d = s.nextInt();
        try {
            int element = arr[index];
            try {
                int result = element / d;
                System.out.println("Division Result : " + result);
            } catch (ArithmeticException a) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException n) {
            System.out.println("Invalid array index!");
        }
    }
}
