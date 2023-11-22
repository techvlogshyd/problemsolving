package practice.javaconceptoftheday.strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverseWords("I am Prasanna"));
        System.out.println(reverseWords("Java Concept Of The Day"));
        System.out.println(reverseWords("Java J2EE JSP Servlets Hibernate Struts"));
        System.out.println(reverseWords("I am string not reversed"));
        System.out.println(reverseWords("Reverse Me"));
    }
    static String reverseWords(String input){
        String reverseString = "";
        for(String word : input.split(" ")){
            String reverseWord = "";
            for (int i = word.length()-1; i >= 0 ; i--) {
                reverseWord += word.charAt(i);
            }
            reverseString += reverseWord+" ";
        }
        return reverseString;
    }
}
