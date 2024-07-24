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

        System.out.println("Are you older than 20? (yes/no)");
        String response = scanner.nextLine();
        boolean olderThan20 = response.equalsIgnoreCase("yes");

        System.out.println("Are you older than 30? (yes/no)");
        response = scanner.nextLine();
        boolean olderThan30 = response.equalsIgnoreCase("yes");

        System.out.println("Are you older than 40? (yes/no)");
        response = scanner.nextLine();
        boolean olderThan40 = response.equalsIgnoreCase("yes");

        System.out.println("Are you older than 50? (yes/no)");
        response = scanner.nextLine();
        boolean olderThan50 = response.equalsIgnoreCase("yes");

        System.out.println("Are you older than 60? (yes/no)");
        response = scanner.nextLine();
        boolean olderThan60 = response.equalsIgnoreCase("yes");

        int age = 0;
        if (olderThan60) {
            System.out.println("Are you older than 70? (yes/no)");
            response = scanner.nextLine();
            boolean olderThan70 = response.equalsIgnoreCase("yes");

            if (olderThan70) {
                System.out.println("Are you older than 80? (yes/no)");
                response = scanner.nextLine();
                boolean olderThan80 = response.equalsIgnoreCase("yes");

                age = olderThan80 ? 80 : 70;
            } else {
                age = 60;
            }
        } else if (olderThan50) {
            age = 50;
        } else if (olderThan40) {
            age = 40;
        } else if (olderThan30) {
            age = 30;
        } else if (olderThan20) {
            age = 20;
        } else {
            System.out.println("Are you younger than 10? (yes/no)");
            response = scanner.nextLine();
            boolean youngerThan10 = response.equalsIgnoreCase("yes");

            age = youngerThan10 ? 5 : 15;
        }

        System.out.println("I guess your age is around " + age + " years old!");
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
