/*
//Main.java
//This class will run the main part of the program

Austin Stephens
Rasmussen University
07/18/2024
Professor Kumar
COT4530C

Sort and Search Algorithms

//Seperate into classes
Instructions: Write a Java program that generates a list of 100, 500, 1000, 10000 random numbers between 1 and 1000, inclusive.

The program should implement two different sorting algorithms to sort the random list of numbers.

Run tests on the two algorithms and report (tabulated and commentary) on your findings on the performance of the algorithms.

Also implement two search algorithms in your program, to search for the actual number 500.

Run tests on the two algorithms and report (tabulated and commentary) on your findings on the performance of the search algorithms.

We selected the following algorithms to sort and search the random numbers:
Selection Sort
Insertion Sort
Linear Search
Binary Search
 */


package solution;

public class Main {
    public static void main(String[] args) {
        //Start the program
        System.out.println("Starting....");

        //Run menu in try catch block in case of errors
        try {
            menu menu = new menu();
            menu.run();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}