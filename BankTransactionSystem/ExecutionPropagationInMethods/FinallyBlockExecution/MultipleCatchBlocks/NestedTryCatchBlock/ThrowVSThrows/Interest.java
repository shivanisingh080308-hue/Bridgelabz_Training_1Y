package ThrowVSThrows;
import java.util.Scanner;
public class Interest {
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        double result = (amount * rate * years) / 100;
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter the amount");
            double a = s.nextDouble();
            System.out.println("Enter the rate");
            double r = s.nextDouble();
            System.out.println("Enter the time");
            int y = s.nextInt();
            double answer = calculateInterest(a, r, y);
            System.out.println("Calculated Interest is : " + answer);
        } catch (IllegalArgumentException i) {
            System.out.println(i.getMessage());
        }
    }
}
