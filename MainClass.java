package ict._22.ClassNames;

import java.util.Scanner;

class SumClass {
  
    static void sumSeries() {
        double sum = 0.0, i = 1.0;
        do {
            sum += i;
            i -= 0.1;
        } while (i >= 0.1);
        System.out.printf("Sum of series (1 + 0.9 + ... + 0.1) = %.2f\n", sum);
    }
}

class DivisorMultipleClass {

    static int gcd(int a, int b) {
        do {
            int temp = b;
            b = a % b;
            a = temp;
        } while (b != 0);
        return a;
    }

    // Static LCM
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    static void showGcdLcm(int a, int b) {
        System.out.println("GCD of " + a + " and " + b + " = " + gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " = " + lcm(a, b));
    }
}

class NumberConversionClass {
    static void convertNumbers(int decimal) {
        String binary = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        String hexa = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexa);


        System.out.println("\nReverse Conversions:");
        System.out.println("Binary to Decimal: " + Integer.parseInt(binary, 2));
        System.out.println("Octal to Decimal: " + Integer.parseInt(octal, 8));
        System.out.println("Hexa to Decimal: " + Integer.parseInt(hexa, 16));
    }
}

class CustomPrintClass {
    static void pr(String text) {
        System.out.println(text);
    }
}

public class MainClass {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CustomPrintClass.pr("=== Java Control Statements (do-while tasks) ===");

        
        CustomPrintClass.pr("\n[1] SUM CLASS");
        SumClass.sumSeries();
        CustomPrintClass.pr("\n[2] DIVISOR MULTIPLE CLASS");
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        DivisorMultipleClass.showGcdLcm(a, b);

        
        CustomPrintClass.pr("\n[3] NUMBER CONVERSION CLASS");
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        NumberConversionClass.convertNumbers(num);

      
        CustomPrintClass.pr("\n[4] CUSTOM PRINT CLASS EXAMPLE");
        CustomPrintClass.pr("Hello from CustomPrintClass.pr()!");

        CustomPrintClass.pr("\n=== Program Finished ===");
    }
}
