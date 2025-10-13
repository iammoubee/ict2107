import java.util.Scanner;  

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }

    
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Scanner for input

     
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("\nChoose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(a + " + " + b + " = " + add(a, b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + subtract(a, b));
                break;
            case 3:
                System.out.println(a + " * " + b + " = " + multiply(a, b));
                break;
            case 4:
                double result = divide(a, b);
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close(); 
    }
}
