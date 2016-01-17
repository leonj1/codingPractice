package subsequence_of_string;

import java.util.ArrayList;
import java.util.List;

/**
 * Current output
 ac
 bc
 ba
 c
 a

 This is missing abc, and b
 */

public class Solution1 {
    public static void main(String[] args) {

        String[] result = buildSubsets("bac");
        for(String i : result)
            System.out.println(i);

    }

    public static String[] buildSubsets(String input) {
        List<String> results = new ArrayList();

        for(int i=0; i<input.length(); i++) {
            String partial = input.substring(i);
            List<String> possible = combinations(partial);
            results.addAll(possible);
        }

        String[] output = results.toArray(new String[results.size()]);

        return output;
    }

    public static List<String> combinations(String s) {
        if (s.length() == 0)
            return new ArrayList();

        char[] letters = s.toCharArray();

        List<String> possible = new ArrayList();

        for(int i=0; i<letters.length; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<letters.length; j++) {
                if(i!=j) {
                    sb.append(letters[j]);
                }
            }
            possible.add(sb.toString());
        }

        return possible;
    }
}
