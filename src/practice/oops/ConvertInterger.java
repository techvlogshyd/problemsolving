package practice.oops;

import java.util.HashSet;
import java.util.*;

public class ConvertInterger {
    public static void main(String[] args) {
        System.out.println(convertToInt("123"));
        System.out.println("aabcdanm");

    }
    static int convertToInt(String input){
        int result = 0, counter = 0;
        for(char ch : input.toCharArray()){
            result += ch - '0'; //1 56 - 55
            if(counter < input.length()-1) {
                result *= 10;
            }
            counter++;
        }
        return result;

    }
//              1
//            1 2 1
//            1 3 3 1
//            1 4 6 4 1
    //      1 5 10 10 5 1
    //tring a = “aabcdanm” ->abcd danm

    static void printPattern(int noOfRows){
        int[][] result = new int[noOfRows][noOfRows];
        for (int i = 1; i < noOfRows; i++) {

        }
    }

    //String a = “aabcdanm”
    //set a
    //a

    static String longestSubString(String input){
        
        Set<Character> set = new HashSet<>();
        int left = 0;
        int longest = 0;
        String longestSubString = "";
        for (int right = 0; right < input.length(); right++) {
            char ch = input.charAt(right);
            if(!set.contains(ch)){
                set.add(input.charAt(right));
                right++;
                longest = Math.max(longest, right - left + 1);
                String subString = input.substring(left, right + 1);
                if(subString.length() > longestSubString.length()){
                    longestSubString = subString;
                }
            }
            else{
               while(set.contains(input.charAt(right))) {
                   set.remove(input.charAt(left));
                   left++;
               }
                set.add(input.charAt(right));
                right = left;
            }
        }
        return longestSubString;
    }
    

}

