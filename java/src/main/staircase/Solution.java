package staircase;

public class Solution {
    public static void main(String[] args){
        int count = 6;
        StairCase(count);
    }

    static void StairCase(int n) {

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<n+1; i++) {
            sb.append(repeat(" ", n-i));
            sb.append(repeat("#", i));
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    static private String repeat(String character, int times) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<times; i++) {
            sb.append(character);
        }
        return sb.toString();
    }
}
