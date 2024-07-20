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

public final class numRandom {
    // Initialize the array here to be used in other classes to store the random numbers
    public static int[] randomArray1;
    public static int[] randomArray2;

    public static void generate(int i) {
        // Initialize the array with size i to store the random numbers generated in the loop
        randomArray1 = new int[i];
        randomArray2 = new int[i];


        // Loop through the array to generate random numbers and store them in the array
        for (int j = 0; j < i; j++) {
            try {
                // Generate a random number between 1 and 1000
                // + 1 is added to include 1000 in the random number generation
                int random = (int) (Math.random() * 1000 + 1);
                // Store the random number in our arrays
                randomArray1[j] = random;
                randomArray2[j] = random;
                System.out.println(random);
            } catch (Exception e) {
                System.out.println("Error at random array " + e.getMessage());
            }
        }
    }
}
