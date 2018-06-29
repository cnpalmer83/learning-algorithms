package algo.mergesort;

public class App {
    public static void main(String[] args) {

        int[] myArray = new int[] {7, 9, 3, 5, 11, 1, 4};

        MergeSort sorter = new MergeSort();
        sorter.sort(myArray);
        sorter.displayArray(myArray);
    }
}
