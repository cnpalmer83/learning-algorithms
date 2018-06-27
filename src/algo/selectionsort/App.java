package algo.selectionsort;

public class App {

    public static void main(String[] args) {

        int[] myArray = selectionSort(new int[]{9, 8, 3, 13, 87, 12, 99});
        displayArray(myArray);
    }

/*
    public static int[] selectionSort(int arr[]) {
        int [] sorted = arr;
        for (int i = 0; i < sorted.length - 1; i++) {
            int minimum = sorted[i];
            for (int j = (i + 1); j < sorted.length - 1; j++) {
                if (sorted[j] < sorted[minimum])
                    minimum = sorted[j];
                sorted[i] = sorted[minimum];
            }
        }
        return sorted;
    }
*/
    public static int[] selectionSort(int arr[]) {
        for (int arrIndex = 0; arrIndex < arr.length; arrIndex++) {
            int minimum = arrIndex;
            for (int nextIndex = (arrIndex + 1); nextIndex < arr.length; nextIndex++) {
                if (arr[nextIndex] < arr[minimum]) {
                    minimum = nextIndex;
                }
            }
            int temp = arr[arrIndex];
            arr[arrIndex] = arr[minimum];
            arr[minimum] = temp;
        }
        return arr;
    }

    public static void displayArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" [" + arr[i] + "]");
        }
    }
}