package algo.recursion.binarysearch;

public class App {

    public static void main(String[] args) {
        int[] myArray = new int[4];
        myArray[0] = 11;
        myArray[1] = 22;
        myArray[2] = 33;
        myArray[3] = 44;

        int index = recursiveBinarySearch(myArray, 0, myArray.length - 1, 11);
        System.out.println("Expected: [0]  Result: [" + index + "]");

        index = recursiveBinarySearch(myArray, 0, myArray.length - 1, 22);
        System.out.println("Expected: [1]  Result: [" + index + "]");

        index = recursiveBinarySearch(myArray, 0, myArray.length - 1, 33);
        System.out.println("Expected: [2]  Result: [" + index + "]");

        index = recursiveBinarySearch(myArray, 0, myArray.length - 1, 44);
        System.out.println("Expected: [3]  Result: [" + index + "]");

        index = recursiveBinarySearch(myArray, 0, myArray.length - 1, 45);
        System.out.println("Expected: [-1] Result: [" + index + "]");
    }

    public static int recursiveBinarySearch(int[] arr, int first, int last, int value) {

        if (first > last)
            return -1;
        else {
            int middle = (first + last) / 2;
            if (arr[middle] == value)
                return middle;
            else if (arr[middle] > value)
                return recursiveBinarySearch(arr, first, middle - 1, value);
            else
                return recursiveBinarySearch(arr, middle + 1, last, value);
        }
    }
}
