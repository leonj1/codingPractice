package list_max;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * 4 3
 * 2 3 603
 * 1 1 286
 * 4 4 882
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;

        int sizeOfArray = 0;
        int numOfOperations = 0;

        try {
            s = in.readLine();
            String[] tmpArray = s.split(" ");
            sizeOfArray = Integer.parseInt(tmpArray[0]);
            numOfOperations = Integer.parseInt(tmpArray[1]);

            long[] result = new long[sizeOfArray];
            int indexStart = 0;
            long indexEnd = 0;
            long number = 0;
            long largestNumber = 0;

            for(int i=0; i<numOfOperations; i++) {
                s = in.readLine();
                tmpArray = s.split(" ");
                indexStart = Integer.parseInt(tmpArray[0]);
                indexEnd = Long.parseLong(tmpArray[1]);
                number = Long.parseLong(tmpArray[2]);

                for(int j=indexStart-1; j<=indexEnd-1; j++) {
                    result[j]+= number;
                    if (result[j] > largestNumber) {
                        largestNumber = result[j];
                    }
                }
            }

            System.out.println(largestNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
