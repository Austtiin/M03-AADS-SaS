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
//MENU
        //MENU
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



//GENERATE RANDOM NUMBERS
        //GENERATE RANDOM NUMBERS
        //Start timer to see how long it takes to generate random numbers
        long startTime = System.nanoTime();
        numRandom.generate(Integer.parseInt(input));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        //print in ms
        System.out.println("Time to generate random numbers: " + duration / 1000000 + "ms");



//SELECTION SORT
        //SELECTION SORT
        //Sort the random numbers using selection sort
        System.out.println("\nSorting random numbers using SELECTION SORT...");
        //Start timer to see how long it takes to sort the random numbers
        long startTimeSort = System.nanoTime();
        int[] selectionSort = sortSelection.selectionSort(numRandom.randomArray1);
        long endTimeSort = System.nanoTime();
        System.out.println("Selection sort complete\n");
        long durationSort = (endTimeSort - startTimeSort);
        //print in ms
        System.out.println("Time to sort random numbers: " + durationSort / 1000000 + "ms");

        //Print the sorted array using selection sort algorithm
        System.out.println("Sorted array using SELECTION SORT:");
        for (int i : selectionSort) {
            System.out.println(i);
        }


//INSERTION SORT
        //INSERTION SORT
        //Sort the random numbers using insertion sort on array 2
        System.out.println("\nSorting random numbers using INSERTION SORT on Array 2...");
        //Start timer to see how long it takes to sort the random numbers
        long startTimeSort2 = System.nanoTime();
        int[] insertionSort = sortInsertion.insertionSort(numRandom.randomArray2);
        long endTimeSort2 = System.nanoTime();
        System.out.println("Insertion sort complete\n");
        long durationSort2 = (endTimeSort2 - startTimeSort2);
        //print in ms
        System.out.println("Time to sort random numbers: " + durationSort2 / 1000000 + "ms");


    }
}
