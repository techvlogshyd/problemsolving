package interview.servicenow.hackerrank;
/*
Given two strings, determine the number of times the first one appears as a subsequence in the second one. A subsequence is created by eliminating any number of characters from a string (possibly 0) without changing the order of the characters retained.
Example
51 = "ABC"
52 = "ABCBABC"

The string s1 appears 5 times as a subsequence in s2 at 1-indexed positions of (1, 2, 3), (1, 2, 7), (1, 4, 7), (1, 6, 7), and (5, 6, 7). The answer is 5.
Function Description
Complete the function getSubsequenceCount in the editor below.
getSubsequenceCount has the following parameters:
string s1: the first string, which always has a length of 3 string s2: the second string Returns:
int: the number of times s1 appears as a subsequence in 52
Constraints
789@gmal.com
length of s1 = 3
s1 ≤ length of s2 ≤ 5
• s1 and s2 consist of uppercase English letters, A-Z.
 */
public class SubsequenceCount {
    public static int getSubsequenceCount(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        int[][] dp = new int[n1 + 1][n2 + 1];

        // Base cases
        for (int j = 0; j <= n2; j++) {
            dp[0][j] = 1;
        }

        // Dynamic programming
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }

        return dp[n1][n2];
    }
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABCBABC";
        int result = getSubsequenceCount(s1, s2);
        System.out.println("Number of times s1 appears as a subsequence in s2: " + result);
    }
}
