package src.main.binary_search;

/**
 * Implement Binary Search Algo
 */
public class Solution {

    public static void main(String[] args) {
        int[] array1 = new int[] {1,2,3,4,5,5,5,6,7,8};
        int[] numChecks = new int[] {9,5,0,10,3};

        for(int i : numChecks) {
            System.out.println(findPosition(array1, i));
        }
    }

    // TODO Update this to handle getting the max-most 5 position - recursion!!!
    public static int findPosition(int[] array, int num) {
        int last = array.length;

        if (last == 0) {
            return -1;
        }

        if (last == 1 && array[last] == num) {
            return 0;
        }

        if (array[last-1] < num ) {
            return -1;
        }

        int first = 0;

        int middle = (last + first) / 2;
        int currentValue = 0;

        while (first <= last) {
            currentValue = array[middle];

            if (currentValue < num) {
                first = middle + 1;
            } else if (currentValue == num) {
                return middle;
            } else {
                last = middle - 1;
            }

            middle = (first + last) / 2;
        }

        if (first > last) {
            return -1;
        }

        return 0;
    }
}
