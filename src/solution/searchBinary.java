// searchBinary.java
// This class will search for the number 500 using the binary search algorithm
// Austin Stephens
// Rasmussen University
// 07/19/2024
// Professor Kumar
// COT4530C
// Sort and Search Algorithms
//

package solution;

public class searchBinary {
    //grab the random numbers from numRandom array to search in binary search function and sort the array
    public static void binarySearch(int[] randomArray) {
        //This will search for the number 500 using the binary search algorithm to find the index of 500
        //set the left index to 0 to start the search to the left of the array
        int left = 0;
        //set the right index to the length of the array - 1
        int right = randomArray.length - 1;
        //loop through the array to find the number 500
        while (left <= right) {
            //set the middle index to the left index + right index / 2
            //this will find the middle index of the array to search
            int mid = left + (right - left) / 2;
            //if the middle index is equal to 500
            if (randomArray[mid] == 500) {
                //print the index of 500 found
                System.out.println("Number 500 found at index: " + mid);
                //return the index of 500 and stop the loop
                return;
            }
            //if the middle index is less than 500
            if (randomArray[mid] < 500) {
                //set the left index to the middle index + 1 to search the right side of the array again
                left = mid + 1;
            } else {
                //set the right index to the middle index - 1 to search the left side of the array
                right = mid - 1;
            }
        }
        //print if 500 is not found
        System.out.println("Number 500 not found");
    }

}
