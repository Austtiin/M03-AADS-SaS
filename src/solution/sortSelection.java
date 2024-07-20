//sortSelection.java
//This class will sort the random numbers using the selection sort algorithm
//Austin Stephens
//Rasmussen University
//07/18/2024
//Professor Kumar
//COT4530C
//Sort and Search Algorithms
//


package solution;

public class sortSelection {
    //grab the random numbers from numRandom array to sort in selection sort function
    public static int[] selectionSort(int[] randomArray) {
        //This will sort the random numbers using the selection sort algorithm
        //loop through the array
        for (int i = 0; i < randomArray.length - 1; i++) {
            //set the minimum value to the current index
            int min = i;
            //loop through the array again to find the minimum value
            for (int j = i + 1; j < randomArray.length; j++) {
                //if the current index is less than the minimum value
                if (randomArray[j] < randomArray[min]) {
                    //set the minimum value to the current index
                    min = j;
                }
            }
            //swap the minimum value with the current index
            int temp = randomArray[min];
            //set the minimum value to the current index
            randomArray[min] = randomArray[i];
            //set the current index to the minimum value
            randomArray[i] = temp;
        }
        //return the sorted array
        return randomArray;
    }
}
