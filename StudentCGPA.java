import java.util.Scanner;

public class StudentCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();

        System.out.print("Enter number of courses: ");
        int numCourses = sc.nextInt();

        double totalCreditTaken = 0;
        double totalWeightedGP = 0;
        double totalCreditEarned = 0;

        
        for (int i = 1; i <= numCourses; i++) {
            System.out.println("\nCourse " + i + ":");
            System.out.print("Credit (Max 3): ");
            double credit = sc.nextDouble();

            System.out.print("Class Test (Max 30): ");
            double ct = sc.nextDouble();

            System.out.print("Assignment (Max 10): ");
            double at = sc.nextDouble();

            System.out.print("Final Exam (Max 60): ");
            double fe = sc.nextDouble();

            double totalMarks = ct + at + fe;
            double gpa = 0.0;

        
            if (totalMarks >= 80)
                gpa = 4.0;
            else if (totalMarks >= 75)
                gpa = 3.75;
            else if (totalMarks >= 70)
                gpa = 3.5;
            else if (totalMarks >= 65)
                gpa = 3.25;
            else if (totalMarks >= 60)
                gpa = 3.0;
            else if (totalMarks >= 55)
                gpa = 2.75;
            else if (totalMarks >= 50)
                gpa = 2.5;
            else if (totalMarks >= 45)
                gpa = 2.25;
            else if (totalMarks >= 40)
                gpa = 2.0;
            else
                gpa = 0.0;

            totalCreditTaken += credit;
            totalWeightedGP += (gpa * credit);

            if (gpa > 0)
                totalCreditEarned += credit;
        }

      
        double cgpa = totalWeightedGP / totalCreditTaken;

      
        String grade = "";
        if (cgpa == 4.0)
            grade = "A+";
        else if (cgpa >= 3.75)
            grade = "A";
        else if (cgpa >= 3.5)
            grade = "A-";
        else if (cgpa >= 3.25)
            grade = "B+";
        else if (cgpa >= 3.0)
            grade = "B";
        else if (cgpa >= 2.75)
            grade = "B-";
        else if (cgpa >= 2.5)
            grade = "C+";
        else if (cgpa >= 2.25)
            grade = "C";
        else if (cgpa >= 2.0)
            grade = "D";
        else
            grade = "F";

        System.out.println("\n--- Student Result ---");
        System.out.println("Student ID: " + studentId);
        System.out.println("Credit Taken: " + totalCreditTaken);
        System.out.println("Credit Earned: " + totalCreditEarned);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
