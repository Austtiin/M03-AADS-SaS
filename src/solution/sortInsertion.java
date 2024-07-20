//sortInsertion
// class will sort the random numbers using the insertion sort algorithm
//Austin Stephens
//Rasmussen University
//07/19/2024
//Professor Kumar
//COT4530C
//Sort and Search Algorithms
//

package solution;

public class sortInsertion {
    //grab the random numbers from numRandom array to sort in insertion sort function
    public static int[] insertionSort(int[] randomArray) {
        //This will sort the random numbers using the insertion sort algorithm and return the sorted array
        //loop through the array
        for (int i = 1; i < randomArray.length; i++) {
            //set the current value to the current index
            int current = randomArray[i];
            //set the previous index to the current index - 1
            int j = i - 1;
            //loop through the array again
            while (j >= 0 && current < randomArray[j]) {
                //move the current value to the previous index
                randomArray[j + 1] = randomArray[j];
                j--;
            }
            //move the current value to the previous index + 1
            randomArray[j + 1] = current;
        }
        //print the sorted array
        for (int j : randomArray) {
            System.out.println(j);
        }
        //return the sorted array
        return randomArray;
    }
}
