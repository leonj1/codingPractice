package merge_two_arrays;

public class Solution {
    public static void main(String[] args) {
        int[] a = new int[]{1,5,7,7};
        int[] b = new int[]{0,1,2,3};

        int[] result = mergeArrays(a,b);

        for(int n : result) {
            System.out.println(n);
        }
    }

    static int[] mergeArrays(int[] a, int[] b) {

        int ptrA = 0;
        int ptrB = 0;
        int currentPtr = 0; // 0 = a, 1 = b

        int maxArrayLength = a.length * 2;

        int[] result = new int[maxArrayLength];

        for(int i=0; i<maxArrayLength; i++) {
            if (ptrA >= a.length) {
                result[i] = b[ptrB++];
                currentPtr = -1;
            }
            if (ptrB >= b.length) {
                result[i] = a[ptrA++];
                currentPtr = -1;
            }
            if (currentPtr == 0) {
                if (a[ptrA] < b[ptrB]) {
                    result[i] = a[ptrA++];
                } else {
                    result[i] = b[ptrB++];
                    currentPtr = 1;
                }
            } else if (currentPtr == 1) {
                if(b[ptrB] < a[ptrA]) {
                    result[i] = b[ptrB++];
                } else {
                    result[i] = a[ptrA++];
                    currentPtr = 0;
                }
            }
        }

        return result;

    }
}
