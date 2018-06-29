package algo.quicksort;

/*
    This program demonstrates the Quick Sort algorithm on an integer array.
    Additional notes to follow.
 */
public class App {
    public static void main(String[] args) {

        int[] inputArray = {12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4};
        QuickSort obj = new QuickSort();
        obj.quickSort(inputArray, 0, inputArray.length - 1);
        obj.display(inputArray);
    }
}
