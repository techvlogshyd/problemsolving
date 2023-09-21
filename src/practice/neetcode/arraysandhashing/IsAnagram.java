package practice.neetcode.arraysandhashing;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("anagram","nagaras"));
    }
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length())
            return false;
        int[] charOccurrence = new int[26];
        for (int i = 0; i <s.length(); i++) {
            charOccurrence[s.charAt(i) - 'a'] += 1;
            charOccurrence[t.charAt(i) - 'a'] -= 1;
        }
        for (int i = 0; i < 26; i++) {
            if (charOccurrence[i] != 0)
                return false;
        }
       return true;
    }
}
