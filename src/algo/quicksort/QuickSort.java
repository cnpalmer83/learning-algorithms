package algo.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] inputArray, int start, int end) {
        if (start < end) {
            int partition = partition(inputArray, start, end);  // Gives index position of correctly placed value in array
            quickSort(inputArray, start, partition - 1);    // Sort left side
            quickSort(inputArray, partition + 1, end);      // Sort right side
        }
    }

    public static int partition(int[] inputArray, int start, int end) {

        int pivot = inputArray[end];
        int i = start - 1;

        for (int j = start; j <= (end - 1); j++) {
            if (inputArray[j] <= pivot) {
                i++;
                // Now swap values
                int iValue = inputArray[i];
                int jValue = inputArray[j];
                inputArray[i] = jValue;
                inputArray[j] = iValue;
            }
        }
        // Put the pivot value in the correct spot next
        // and return the index that pivot is placed in.
        int iValue = inputArray[i + 1];
        inputArray[end] = iValue;
        inputArray[i + 1] = pivot;

        return (i + 1);
    }

    public static void display(int[] inputArray) {
        System.out.println(Arrays.toString(inputArray));
    }
}
