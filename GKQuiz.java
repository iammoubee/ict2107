package ict._22.GKQuiz;

import java.io.*;
import java.util.*;

public class GKQuiz {

    static class Question {
        String questionText;
        String[] options;
        char correctAnswer;

        Question(String q, String[] opts, char ans) {
            this.questionText = q;
            this.options = opts;
            this.correctAnswer = ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== High School General Knowledge Quiz ===");

    
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

  
        List<Question> quiz = loadQuestions();

        int score = 0;

      
        for (int i = 0; i < quiz.size(); i++) {
            Question q = quiz.get(i);
            System.out.println("\nQ" + (i + 1) + ". " + q.questionText);
            for (int j = 0; j < q.options.length; j++) {
                System.out.println((char) ('A' + j) + ") " + q.options[j]);
            }

            System.out.print("Your answer (A/B/C/D): ");
            char ans = Character.toUpperCase(sc.next().charAt(0));

            if (ans == q.correctAnswer) {
                System.out.println(" Correct!");
                score += 10;
            } else {
                System.out.println("Wrong! Correct answer is " + q.correctAnswer);
            }
        }

    
        System.out.println("\n=== Quiz Over ===");
        System.out.println(name + ", your total score is: " + score + " / " + (quiz.size() * 10));

        saveScore(name, score);
        System.out.println("Your score has been saved in results.txt.");

        sc.close();
    }

  
    public static List<Question> loadQuestions() {
        List<Question> list = new ArrayList<>();

        list.add(new Question(
                "Which planet is known as the Red Planet?",
                new String[]{"Earth", "Mars", "Jupiter", "Venus"},
                'B'));

        list.add(new Question(
                "Who wrote the play 'Romeo and Juliet'?",
                new String[]{"William Shakespeare", "Leo Tolstoy", "Mark Twain", "Charles Dickens"},
                'A'));

        list.add(new Question(
                "What is the largest mammal in the world?",
                new String[]{"Elephant", "Giraffe", "Blue Whale", "Hippopotamus"},
                'C'));

        list.add(new Question(
                "In which continent is the Sahara Desert located?",
                new String[]{"Asia", "South America", "Africa", "Australia"},
                'C'));

        list.add(new Question(
                "Which gas do plants absorb from the atmosphere?",
                new String[]{"Oxygen", "Nitrogen", "Carbon Dioxide", "Helium"},
                'C'));

        return list;
    }
    public static void saveScore(String name, int score) {
        try (FileWriter fw = new FileWriter("results.txt", true)) {
            fw.write(name + " - Score: " + score + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to results.txt");
        }
    }
}
