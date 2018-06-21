package algo.recursion.linearsearch;

/*
    This program demonstrates a simple linear search using recursion.  I forgot
    the return statement on line 32 during the first implementation which resulted
    in wasted time trying to re-write otherwise working code.
 */
public class App {

    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 2;
        myArray[1] = 4;
        myArray[2] = 6;
        myArray[3] = 8;
        myArray[4] = 10;

        int index = recursiveLinearSearch(myArray, 0, 6);
        System.out.println("Expected: [2]  Result: [" + index + "]");

        index = recursiveLinearSearch(myArray, 0, 1);
        System.out.println("Expected: [-1]  Result: [" + index + "]");
    }

    public static int recursiveLinearSearch(int[] arr, int index, int value) {

        if (index > arr.length -1)
            return -1;
        else if (arr[index] == value)
            return index;
        else
            return recursiveLinearSearch(arr, index + 1, value);
    }
}
