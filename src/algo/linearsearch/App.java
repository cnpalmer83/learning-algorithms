package algo.linearsearch;

public class App {

    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 2;
        myArray[1] = 4;
        myArray[2] = 6;
        myArray[3] = 8;
        myArray[4] = 10;

        int index = linearSearch(myArray, 6);
        System.out.println("Expected: [2]  Result: [" + index + "]");

        index = linearSearch(myArray, 1);
        System.out.println("Expected: [-1]  Result: [" + index + "]");
    }

    public static int linearSearch(int[] arr, int value) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1;
    }
}
