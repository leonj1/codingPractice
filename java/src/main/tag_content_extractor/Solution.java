package tag_content_extractor;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Return the text in between tags
 * tags must match and are case sensitive
 * If no match then return "None"
 * If more than one match per line, then return each match in a separate line
 *
 * TODO - Almost there,
 * just need to fix the problem with the second line since we should get the text without the tag
 Nayeem loves counseling
 <h1>Sanjay has no watch
 None
 Imtiaz has a secret crush
 */
public class Solution {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList(
            "<h1>Nayeem loves counseling</h1>",
            "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>",
            "<Amee>safat codes like a ninja</amee>",
            "<SA premium>Imtiaz has a secret crush</SA premium>"
        );

        for(String line : lines) {
            getText(line);
        }
    }

    static void getText(String line) {
        String openingTagPattern = "<(.+?)>";
        Pattern r1 = Pattern.compile(openingTagPattern);
        Matcher m1 = r1.matcher(line);
        if (m1.find()) {
            String openingTag = m1.group(1);
            String closingTagPattern = String.format("</%s>", openingTag);
            Pattern r2 = Pattern.compile(closingTagPattern);
            Matcher m2 = r2.matcher(line);
            if (m2.find()) {
                String textBetweenTags = String.format("<%s>(.+?)</%s>", openingTag, openingTag);
                Pattern r3 = Pattern.compile(textBetweenTags);
                Matcher m3 = r3.matcher(line);
                if(m3.find()) {
                    System.out.println(m3.group(1));
                } else {
                    System.out.println("None");
                }
            } else {
                System.out.println("None");
            }
        } else {
            System.out.println("None");
        }
    }
}
