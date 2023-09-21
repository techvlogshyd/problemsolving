package practice.problems;

import java.util.StringTokenizer;

public class CountWords {
    public static int countWordsUsingSplit(String inputString) {
        String[] stringArray = inputString.split("\\s+"); // splitting the string using space/spaces
        return stringArray.length; // returning the length of the array i.e number of words in the string
    }
    public static int countWordsUsingStringTokenizer(String inputString) {
        if (!inputString.isEmpty()) {
            StringTokenizer stringTokenizer = new StringTokenizer(inputString); // create StringTokenizer using the
            // inputString
            return stringTokenizer.countTokens(); // returning the number of tokens i.e. number of words
        }
        return 0;
    }
    public static int countWords(String inputString) {
        int wordCount = 0;
        int endOfString = inputString.length() - 1;
        String str = inputString.trim(); // making sure that string should not have any spaces at the starting and ending
        for (int i = 0; i < inputString.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                wordCount++;
            } else if (str.charAt(i) == ' ' && str.charAt(i++) == ' ') { // if there is more than one space in between
                // string
                i++;
            } else if (i == endOfString) { // matching the first missing word
                wordCount++;
            }
        }
        return wordCount;
    }

    public static void main(String[] args) {
        System.out.println(countWords("My name is Prasannakumar Modugu"));
        System.out.println(countWordsUsingSplit("My name is Prasannakumar Modugu"));
        System.out.println(countWordsUsingStringTokenizer("My name is Prasannakumar Modugu"));
    }
}
