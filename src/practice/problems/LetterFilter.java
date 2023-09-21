package practice.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LetterFilter {
    public static String filterVowels(String input){
        Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        String result="";
        for (char character:input.toCharArray()) {
            if(!vowels.contains(character)){
                result+=character;
            }
        }
        return result;
    }
    public static String filterConsonants(String input){
        Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        String result="";
        for (char character:input.toCharArray()) {
            if(vowels.contains(character)){
                result+=character;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(filterVowels("hackerrank"));
        System.out.println(filterConsonants("hackerrank"));

    }
}
