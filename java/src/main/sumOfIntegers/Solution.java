package sumOfIntegers;

public class Solution {
    public static void main(String[] args) {
//        int[] array = new int[]{1,2,3,4,5};
        int[] array = new int[]{12,12};

        long result = sumOfIntegers(array);

        System.out.println(result);
    }

    static long sumOfIntegers(int[] arr) {
        int sum = 0;

        for(int i=0;i<arr.length; i++) {
            sum+=arr[i];
        }

        return sum;
    }
}
