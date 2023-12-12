package edu.guilford;

import java.util.Scanner;

public class MLBHomeRunQuiz {
    public static void main(String[] args) {

        String[] questions = {
            "Who holds the record for most career home runs in MLB?",
            "Which player hit 73 home runs in a single MLB season?",
            "Who was the youngest player to reach 500 home runs in MLB history?",
            "Which player hit the most home runs in a single decade in MLB?",
            "Who hit the 'Shot Heard 'Round the World' home run in 1951?",
            "Who was the first player to reach 600 career home runs?",
            "Which player hit the most home runs in the 2021 MLB season?",
            "Who hit the most home runs in a single World Series game?",
            "Who was the first player to hit 50 home runs in four consecutive seasons?",
            "Which player hit the most home runs as a rookie in MLB history?"
        };

        String[] answers = {
            "Barry Bonds",
            "Barry Bonds",
            "Alex Rodriguez",
            "Alex Rodriguez",
            "Bobby Thomson",
            "Babe Ruth",
            "Shohei Ohtani",
            "Reggie Jackson",
            "Babe Ruth",
            "Mark McGwire"
        };

        Scanner scanner = new Scanner(System.in);
        
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + answers[i]);
            }
            System.out.println();
        }

        System.out.println("Quiz ended. Your final score is: " + score + "/" + questions.length);

        scanner.close();
    }
}

