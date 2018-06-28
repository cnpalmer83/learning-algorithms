package algo.mergesort;

public class App {
    public static void main(String[] args) {
        int[] myArray = mergeSort(new int[] {7, 9, 3, 5, 11, 1, 4});
        displayArray(myArray);
    }

    public static int[] mergeSort(int[] arr) {

        return arr;
    }

    public static void displayArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" [" + arr[i] + "]");
        }
    }
}
