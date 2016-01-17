package determine_anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * WORKS
 * Determine if two string are anagrams of each other
 */
public class Solution {

    public static void main(String[] args) {
//        Anagram
//        String A = "anagram";
//        String B = "margana";

//        Not Anagrams
        String A = "anagramm";
        String B = "marganaa";

        boolean ret=isAnagram(A,B);
        if(ret)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }

    static boolean isAnagram(String A, String B) {
        String[] aArray = A.toLowerCase().split("");
        String[] bArray = B.toLowerCase().split("");

        List<String> foo = new ArrayList(Arrays.asList(aArray));
        List<String> bar = new ArrayList(Arrays.asList(bArray));

        Collections.sort(foo);
        Collections.sort(bar);

        return foo.equals(bar);
    }
}
