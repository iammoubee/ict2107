package ict._22.Factorion;

import java.util.Scanner;

class FactorionUtil {


    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static boolean isFactorion(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }
}

public class FactorionMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Factorion Number Finder ===");
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        System.out.println("\nFactorion numbers in the range:");

        boolean found = false;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (FactorionUtil.isFactorion(i)) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Factorion numbers found in the given range.");
        }

        scanner.close();
    }
}
