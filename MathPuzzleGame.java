package ict._22.MathPuzzle;

import java.io.*;
import java.util.*;

public class MathPuzzleGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Welcome to the Math Puzzle Game ===");

      
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Select difficulty level (Easy / Medium / Hard): ");
        String level = sc.nextLine().trim().toLowerCase();


        String fileName = "questions_" + level + ".txt"; // e.g. questions_easy.txt

        List<String> questions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                questions.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error: Could not read file " + fileName);
            System.out.println("Make sure the file exists in the project directory.");
            return;
        }


        int score = 0;
        for (String q : questions) {
            String[] parts = q.split(" ");
            if (parts.length < 3) continue; // Skip invalid lines

            try {
                int num1 = Integer.parseInt(parts[0]);
                String op = parts[1];
                int num2 = Integer.parseInt(parts[2]);

                System.out.print(num1 + " " + op + " " + num2 + " = ");
                int ans = sc.nextInt();

                int correct = 0;
                switch (op) {
                    case "+":
                        correct = num1 + num2;
                        break;
                    case "-":
                        correct = num1 - num2;
                        break;
                    case "*":
                        correct = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) correct = num1 / num2;
                        break;
                }

                if (ans == correct) {
                    System.out.println(" Correct!");
                    score += 10; // +10 points per correct answer
                } else {
                    System.out.println(" Wrong! Correct answer is " + correct);
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid question format: " + q);
            }
        }

    
        try (FileWriter fw = new FileWriter("scores.txt", true)) {
            fw.write(name + " (" + level + ") - Score: " + score + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to scores file.");
        }

        System.out.println("\nGame Over! " + name + ", your total score is: " + score);
        System.out.println("Score saved in 'scores.txt'.");
        sc.close();
    }
}
