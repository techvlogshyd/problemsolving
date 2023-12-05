package interview.servicenow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(longestSubString("abcabcbb"));
        System.out.println(longestSubString("pwwkew"));
        System.out.println(longestSubString("aabbabc"));
    }
    static int longestSubString(String input){
        int n = input.length();
        Set<Character> charSet = new HashSet<>();
        int left = 0, longest = 0;
        String longestSubString = "", subString = "";
        for (int right = 0; right < n; right++) {
            if(!charSet.contains(input.charAt(right))){
                charSet.add(input.charAt(right));
                longest = Math.max(longest, right - left + 1);
                subString = input.substring(left, right +1);
                if(subString.length() > longestSubString.length()){
                    longestSubString = subString;
                }
            }
            else {
                while(charSet.contains(input.charAt(right))){
                    charSet.remove(input.charAt(left));
                    left++;
                }
                charSet.add(input.charAt(right));
            }
        }
        System.out.println(longestSubString);
        return longest;
    }
}
