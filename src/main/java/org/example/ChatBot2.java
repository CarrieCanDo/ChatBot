package org.example;

import java.util.Scanner;

public class ChatBot2 {
    public static void main(String[] args) {
        ChatBot2 bot = new ChatBot2();
        bot.greetUser();
        bot.askName();
        bot.guessAge();
        bot.countToNumber();
        bot.testKnowledge();
    }

    public void greetUser() {
        System.out.println("Hi! Welcome to the Java Chatbot2.");
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

        System.out.println("Are you older than 55? (yes/no)");
        response = scanner.nextLine();
        boolean olderThan55 = response.equalsIgnoreCase("yes");

        int age = 0;
        if (olderThan55) {
            System.out.println("Are you older than 60? (yes/no)");
            response = scanner.nextLine();
            boolean olderThan60 = response.equalsIgnoreCase("yes");

            if (olderThan60) {
                System.out.println("Are you older than 65? (yes/no)");
                response = scanner.nextLine();
                boolean olderThan65 = response.equalsIgnoreCase("yes");

                age = olderThan65 ? 70 : 65;
            } else {
                System.out.println("Are you 56 or older? (yes/no)");
                response = scanner.nextLine();
                boolean olderThan56 = response.equalsIgnoreCase("yes");

                age = olderThan56 ? 60 : 56;
            }
        } else if (olderThan50) {
            System.out.println("Are you older than 52? (yes/no)");
            response = scanner.nextLine();
            boolean olderThan52 = response.equalsIgnoreCase("yes");

            age = olderThan52 ? 55 : 52;
        } else if (olderThan40) {
            System.out.println("Are you older than 45? (yes/no)");
            response = scanner.nextLine();
            boolean olderThan45 = response.equalsIgnoreCase("yes");

            age = olderThan45 ? 50 : 45;
        } else if (olderThan30) {
            System.out.println("Are you older than 35? (yes/no)");
            response = scanner.nextLine();
            boolean olderThan35 = response.equalsIgnoreCase("yes");

            age = olderThan35 ? 40 : 35;
        } else if (olderThan20) {
            System.out.println("Are you older than 25? (yes/no)");
            response = scanner.nextLine();
            boolean olderThan25 = response.equalsIgnoreCase("yes");

            age = olderThan25 ? 30 : 25;
        } else {
            System.out.println("Are you younger than 10? (yes/no)");
            response = scanner.nextLine();
            boolean youngerThan10 = response.equalsIgnoreCase("yes");

            if (youngerThan10) {
                System.out.println("Are you younger than 5? (yes/no)");
                response = scanner.nextLine();
                boolean youngerThan5 = response.equalsIgnoreCase("yes");

                age = youngerThan5 ? 3 : 7;
            } else {
                System.out.println("Are you older than 15? (yes/no)");
                response = scanner.nextLine();
                boolean olderThan15 = response.equalsIgnoreCase("yes");

                age = olderThan15 ? 18 : 13;
            }
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
        System.out.println("Congratulations, you are so smart!");
    }
}


