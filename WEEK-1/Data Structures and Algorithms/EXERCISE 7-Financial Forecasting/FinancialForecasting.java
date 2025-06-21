// FinancialForecasting.java
// Week 1 Assignment – Exercise 7: Financial Forecasting
// Submitted by: SINDHU.T | Superset ID: 6428098

import java.util.Scanner;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double forecastValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return forecastValue(currentValue * (1 + growthRate / 100), growthRate, years - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Financial Forecasting Tool");
        System.out.print("Enter current value: ");
        double currentValue = sc.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double futureValue = forecastValue(currentValue, growthRate, years);
        System.out.printf("Future value after %d years: %.2f\n", years, futureValue);
    }
}
