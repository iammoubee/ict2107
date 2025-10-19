import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter length:");
    double length=input.nextDouble();
    System.out.println("Enter Width:");
    double width=input.nextDouble();
    double area=length*width;
    double perimeter=2*(length+width);
    System.out.println("Area="+area);
    System.out.println("Perimeter="+perimeter);
    input.close();
 }


    
}
