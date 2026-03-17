
import java.util.Scanner;

class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter persons count: ");
        int n = sc.nextInt();

        double[][] data = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Weight: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Height: ");
            data[i][1] = sc.nextDouble();

            if (data[i][0] <= 0 || data[i][1] <= 0) {
                System.out.println("Enter positive values");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            data[i][2] = data[i][0] / (data[i][1] * data[i][1]);

            if (data[i][2] <= 18.4)
                status[i] = "Underweight";
            else if (data[i][2] <= 24.9)
                status[i] = "Normal";
            else if (data[i][2] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(
                    "Height: " + data[i][1] +
                            " Weight: " + data[i][0] +
                            " BMI: " + data[i][2] +
                            " Status: " + status[i]
            );
        }
    }
}