package algo.selectionsort;

public class App {

    public static void main(String[] args) {

        int[] myArray = selectionSort(new int[]{9, 8, 3, 13, 87, 12, 99});
        displayArray(myArray);
    }


    public static int[] selectionSort(int arr[]) {
        return arr;
    }

    public static void displayArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" [" + arr[i] + "]");
        }
    }
}