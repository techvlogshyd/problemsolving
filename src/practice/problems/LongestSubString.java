package practice.problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString
{
    public static void main(String[] args) {
        System.out.println(longestSubString("prasanna"));
        System.out.println(longestSubString("abcdefghia"));
        System.out.println(longestSubString("aaaabc"));
    }
    public static int longestSubString(String input){
        int index1=0,index2=0,subStringSize=0;
        Set<Character> chars = new HashSet<>();
        while (index2<input.length()){
            if(!chars.contains(input.charAt(index2))){
                chars.add(input.charAt(index2));
                subStringSize=Math.max(subStringSize,chars.size());
                index2++;
            }
            else{
                chars.remove(input.charAt(index1));
                index1++;
            }

        }
        return subStringSize;
    }


}
