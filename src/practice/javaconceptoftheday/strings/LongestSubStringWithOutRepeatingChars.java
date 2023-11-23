package practice.javaconceptoftheday.strings;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class LongestSubStringWithOutRepeatingChars {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        longestSubstring("abcabcbb");
    }

    static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0, longest = 0;
        for (int right = 0; right < s.length(); right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                longest = Math.max(longest, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        return longest;
    }

    static void longestSubstring(String inputString) {
        //Convert inputString to charArray
        char[] charArray = inputString.toCharArray();
        //Initialization
        String longestSubstring = null;
        int longestSubstringLength = 0;
        //Creating LinkedHashMap with characters as keys and their position as values.
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
        //Iterating through charArray
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            //If ch is not present in charPosMap, adding ch into charPosMap along with its position
            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            }
            //If ch is already present in charPosMap, reposioning the cursor i to the position of ch and clearing the charPosMap
            else {
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
            //Updating longestSubstring and longestSubstringLength
            if (charPosMap.size() > longestSubstringLength) {
                longestSubstringLength = charPosMap.size();
                longestSubstring = charPosMap.keySet().toString();
            }
        }
        System.out.println("Input String : " + inputString);
        System.out.println("The longest substring : " + longestSubstring);
        System.out.println("The longest Substring Length : " + longestSubstringLength);
    }
}