package ict._22.CircleArea;

import java.util.Scanner;
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

  
    public void setRadius(double rad) {
        this.radius = rad;
    }

    
    public double getRadius() {
        return this.radius;
    }


    public double computeArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Circle Area Calculator ===");

        
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();

      
        Circle circle = new Circle(r);

  
        System.out.println("Radius: " + circle.getRadius());
        System.out.printf("Area: %.4f\n", circle.computeArea());


        System.out.print("\nEnter new radius to update: ");
        double newR = sc.nextDouble();
        circle.setRadius(newR);

        System.out.println("Updated Radius: " + circle.getRadius());
        System.out.printf("Updated Area: %.4f\n", circle.computeArea());

        sc.close();
    }
}
