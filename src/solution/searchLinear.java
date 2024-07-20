// searchLinear.java
// This class will search for the number 500 using the linear search algorithm
// Austin Stephens
// Rasmussen University
// 07/19/2024
// Professor Kumar
// COT4530C
// Sort and Search Algorithms
//

package solution;

public class searchLinear {
    //grab the random numbers from numRandom array to search in linear search function
    public static void linearSearch(int[] randomArray) {
        //This will search for the number 500 using the linear search algorithm
        //loop through the array to find the number 500
        for (int i = 0; i < randomArray.length; i++) {
            //if the current index is equal to 500
            if (randomArray[i] == 500) {
                //print the index of 500
                System.out.println("Number 500 found at index: " + i);
                //return the index of 500
                return;
            }
        }
        //print if 500 is not found
        System.out.println("Number 500 not found");
    }
}
