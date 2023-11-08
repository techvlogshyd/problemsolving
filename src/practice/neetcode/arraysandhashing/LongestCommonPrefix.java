package practice.neetcode.arraysandhashing;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] input = {"flower","flow","flight"};
        String[] input2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(input));
        System.out.println(longestCommonPrefix(input2));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++) {
            for(String s: strs) {
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i))
                    return res.toString();
            }
            res.append(strs[0].charAt(i));
        }
        return res.toString();
    }
}
