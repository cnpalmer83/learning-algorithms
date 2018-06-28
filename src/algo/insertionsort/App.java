package algo.insertionsort;

/*
    Insertion sort divides the array into two parts: sorted and unsorted.  The initial
    for loop iterates through the array and uses a nested while loop to "insert" the
    next unsorted element into its position in the sorted partition.
 */
public class App {
    public static void main(String[] args) {
        int[] myArray = insertionSort(new int[] {7, 9, 3, 5, 11, 1, 4});
        displayArray(myArray);
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // assign a variable "element" to hold data from unsorted portion that will be moved to sorted portion.
            int element = arr[i];
            // "j" variable points to index of last value in the sorted portion
            int j = (i - 1);
            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = element;
        }
        return arr;
    }

    public static void displayArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" [" + arr[i] + "]");
        }
    }
}
