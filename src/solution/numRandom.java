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
    //inlcude array to store random numbers
    //public static int[] randomArray starts here to be used in other classes
    public static int[] randomArray;


    public static void generate(int i) {
        // Initialize the array with size i
        randomArray = new int[i];

        for (int j = 0; j < i; j++) {
            try {
                int random = (int) (Math.random() * 1000 + 1);
                randomArray[j] = random;
                System.out.println(random);
            } catch (Exception e) {
                System.out.println("Error at random array " + e.getMessage());
            }
        }
    }
}
