package algo.selectionsort;

/*
    Main() creates an unsorted array which is passed to the selectionSort method.
    selectionSort sorts the array and returns it to main() where it is assigned to
    the variable 'myArray'.  myArray is then passed to the displayArray method
    to output the array for the user.  selectionSort has an O(n^2) complexity making
    it easy to code up and understand, but inefficient.
 */
public class App {

    public static void main(String[] args) {

        int[] myArray = selectionSort(new int[]{9, 8, 3, 13, 87, 12, 99});
        displayArray(myArray);
    }

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