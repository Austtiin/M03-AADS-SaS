// main.java
// This class will run the menu part of the program

// Austin Stephens
// Rasmussen University
// 07/18/2024
// Professor Kumar
// COT4530C


package solution;

import java.util.Scanner;

public class menu {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        //This will run the menu and get the user input
        System.out.println("Welcome to the Sort and Search Algorithms program");
        System.out.println("Please enter a number of random numbers to generate: ");
        System.out.println("Example: 100, 500, 1000, 10000");
        System.out.println("Enter 'exit' to exit the program");
        String input = scanner.nextLine();

        //check input for exit otherwise convert to int
        if (input.equals("exit")) {
            System.out.println("Exiting program...");
            System.exit(0);
        }
        else{
            try {
                Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number or 'exit'");
                System.exit(0);
            }
        }

        //Show input and generate random numbers
        System.out.println("\nYou entered: " + input);
        System.out.println("Generating " + input + " random numbers...\n");
        numRandom.generate(Integer.parseInt(input));
    }
}
