

import java.util.*;
public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double[] heights = new double[11];
        System.out.println("Enter heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
        }
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.println("Total height = " + sum);
        System.out.println("Mean height = " + mean);

    }
}