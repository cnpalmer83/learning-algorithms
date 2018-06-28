package algo.mergesort;

public class MergeSort {

    public static void sort(int[] inputArray) {
        sort(inputArray, 0, (inputArray.length-1));
    }

    public static void sort(int[] inputArray, int start, int end) {
        if (end <= start) {
            return;         // We're done traversing the array
        }

        int mid = (start + end) / 2;
        sort(inputArray, start, mid);   // Sort left half
        sort (inputArray, (mid + 1), end);  // Sort right half
        merge(inputArray, start, mid, end);     // Merge sorted results into the array
    }

    public static void merge(int[] inputArray, int start, int mid, int end) {
        
    }
}
