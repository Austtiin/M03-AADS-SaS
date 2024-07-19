/*
 * numRandom.java
 * This class is used to generate a random number based on user selection
 *
 * Austin Stephens
 * Rasmussen University
 * 07/18/2024
 * Professor Kumar
 * COT4530C
 *
 * Sort and Search Algorithms
 *
 */

package solution;

public class numRandom {
    public static void generate(int i) {
        //This will generate a random number based on user input
        //we loop through to generate the random numbers 'i' ammount of times
        for (int j = 0; j < i; j++) {
            //generate random numbers, times 1000 to get a number between 1 and 1000
            //plus 1 to include 1000
            int random = (int) (Math.random() * 1000 + 1);
            System.out.println(random);
        }
    }
}
