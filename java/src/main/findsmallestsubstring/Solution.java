package src.main.findsmallestsubstring;

import java.util.Scanner;

/**
 * Given a string, find out the lexicographically smallest and largest substring of length k.

 [Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

 Input Format

 First line will consist a string containing english alphabets which has at most 1000 characters. 2nd line will consist an integer k.

 Output Format

 In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.

 Sample Input

 welcometojava
 3
 Sample Output

 ava
 wel
 Explanation

 Here is the list of all substrings of length 3:

 wel
 elc
 lco
 com
 ome
 met
 eto
 toj
 oja
 jav
 ava
 Among them ava is the smallest and wel is the largest.
 */
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String line=sc.next();
        int n=sc.nextInt();

//        System.out.print(my_calculator.divisorSum(n)+"\n");

    }
}
