package find_first_repeated_word;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
     String line = "He had had quite enough of this nonsense.";

        String result = firstRepeatedWord(line);
        System.out.println(result);

    }

    static String firstRepeatedWord(String s) {

        String[] tokens = s.split("[\\s\\t,;:\\-\\.]+");
        String foundToken = "";

        Map<String, Integer> seen = new HashMap();
        for(String token : tokens) {
            if (seen.containsKey(token)) {
                foundToken = token;
                break;
            } else {
                seen.put(token, 1);
            }
        }

        return foundToken;
    }
}
