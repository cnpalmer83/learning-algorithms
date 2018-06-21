package algo.binarysearch;

public class App {

    public static void main(String[] args) {
        int[] myArray = new int[4];
        myArray[0] = 11;
        myArray[1] = 22;
        myArray[2] = 33;
        myArray[3] = 44;

        int index = binarySearch(myArray, 11);
        System.out.println("Expected: [0]  Result: [" + index + "]");

        index = binarySearch(myArray, 22);
        System.out.println("Expected: [1]  Result: [" + index + "]");

        index = binarySearch(myArray, 33);
        System.out.println("Expected: [2]  Result: [" + index + "]");

        index = binarySearch(myArray, 44);
        System.out.println("Expected: [3]  Result: [" + index + "]");

        index = binarySearch(myArray, 45);
        System.out.println("Expected: [-1] Result: [" + index + "]");
    }

    public static int binarySearch(int[] arr, int x) {
        int first = 0;
        int last = arr.length - 1;
        int middle;

        do {
            middle = ((first + last) / 2);

            if (arr[middle] == x)
                return middle;
            else if (arr[middle] > x)
                last = middle - 1;
            else
                first = middle + 1;

        } while (first <= last);

        return -1;
    }
}
