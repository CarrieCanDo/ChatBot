package org.example;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        ChatBot bot = new ChatBot();
        bot.greetUser();
        bot.askName();
        bot.guessAge();
        bot.countToNumber();
        bot.testKnowledge();
    }

    public void greetUser() {
        System.out.println("Hi! Welcome to the Java Chatbot.");
    }

    public void askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("Can you please repeat your name?");
        String repeatedName = scanner.nextLine();
        System.out.println("Thank you, " + repeatedName + "!");
    }

    public void guessAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play a game. I'll guess your age by asking a few questions.");

        int lowerBound = 0;
        int upperBound = 100;

        while (lowerBound < upperBound) {
            int midPoint = (lowerBound + upperBound) / 2;
            System.out.println("Are you older than " + midPoint + "? (yes/no)");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                lowerBound = midPoint + 1;
            } else {
                upperBound = midPoint;
            }
        }

        System.out.println("I guess your age is " + lowerBound + " years old!");
    }

    public void countToNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to count to:");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }

    public void testKnowledge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What is the correct way to declare a variable in Java?");
        System.out.println("1. int x;");
        System.out.println("2. x int;");
        System.out.println("3. int = x;");
        System.out.println("4. int x =;");
        int answer;
        do {
            answer = scanner.nextInt();
            if (answer != 1) {
                System.out.println("Please, try again.");
            }
        } while (answer != 1);
        System.out.println("Congratulations, you are correct!");
    }
}
