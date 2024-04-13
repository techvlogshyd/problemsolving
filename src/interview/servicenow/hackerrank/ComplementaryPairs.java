package interview.servicenow.hackerrank;

import java.util.*;

/*
A pair of strings form a complementary pair if there is some permutation of their concatenation that is a palindrome. For example, the strings "abac" and "cab" form a complementary pair since their concatenation is "abaccab" which can be rearranged to form a palindrome, i.e., "bcaarch".
Given an array of n strings, find the number of complementary pairs that can be formed.
Note: Pairs of strings formed by indices (i, j) and (i, i) are considered the same.
Example
Consider stringData = ["abc", "abcd", "bc", "adc"].
The following complementary pairs can be formed:
("abc", "abcd"), concatenated string = "abcabcd" - arranged as a palindrome -> "abcdcba".
("abc", "bc", concatenated string = "abcbc" -> "bcacb".
("abcd", "adc"), concatenated string = "abcdadc" -> "acdbdca".
Return 3, the number of complementary pairs.
 */
public class ComplementaryPairs {
    public static int countComplementaryPairs(String[] stringData) {
        int count = 0;
        for (int i = 0; i < stringData.length; i++) {
            for (int j = i + 1; j < stringData.length; j++) {
                String concatenated = stringData[i] + stringData[j];
                if (isPalindrome(concatenated)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPalindrome(String str) {
        int[] freq = new int[26];
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }
        int oddCount = 0;
        for (int f : freq) {
            if (f % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= 1;
    }

    public static void main(String[] args) {
        String[] stringData = {"abc", "abcd", "bc", "adc"};
        int result = countComplementaryPairs(stringData);
        System.out.println("Number of complementary pairs: " + result);
    }
}

