package practice.neetcode.slidingwindow;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(containsPermutation("ab", "eidbaooo"));
        System.out.println(containsPermutation("ab", "eidboaooo"));
    }
    static boolean containsPermutation(String s1, String s2){
        if(s1.length() > s2.length()){
            return false;
        }
        int s1Length = s1.length();
        int s2Length = s2.length();
        int[] freqS1 = new int[26];
        int[] freqS2 = new int[26];
        for (int i = 0; i < s1Length; i++) {
            freqS1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2Length; i++) {
            freqS2[s2.charAt(i)-'a']++;
            if(i >= s1Length){
                freqS2[s2.charAt(i-s1Length)-'a']--;
            }
            if(Arrays.equals(freqS1,freqS2)){
                return true;
            }
        }
        return false;
    }
}
