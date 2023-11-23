package practice.javaconceptoftheday.strings;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("anagram", "nagdram"));
    }
    static boolean isAnagram(String s, String t){
        if(s.length() != t.length() || s == null){
            return false;
        }
        int[] charCounter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCounter[s.charAt(i) - 'a']++;
            charCounter[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < charCounter.length; i++) {
            if(charCounter[i] != 0){
                return false;
            }
        }
        return true;
    }
}
