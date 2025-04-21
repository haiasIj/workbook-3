package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            String[] famousQuotes = {"I think, therefore I am", "Practice makes perfect", "When you have a dream, you've got to grab it and never let go", "Live as if you were to die tomorrow. Learn as if you were to live forever", "The best way to predict the future is to create it", "Self love is the best love", "The earth is just a rock without the voices of art", "A penny for your thoughts, a dollar for your dreams", "Live your life, live it right, Be different, do different things", "Be yourself; everyone else is already taken"};

            System.out.print("Please pick a number (Enter 0-9): ");

            int index = scanner.nextInt();

            System.out.println(famousQuotes[index]);

        } catch (Exception e) {
            System.out.println("Please pick a number 1-9");
        }

        boolean Y = true;
        boolean N = false;

        System.out.println("Would you like to see a different quote (Enter Y for Yes!; N for No...): ");

        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        if (Y) {
            System.out.println("Rerun the program!");
        } else if (N) {
            System.out.println("Exit the program!");
        } else {
            System.out.println("Exit the program!");
        }
    }
}
