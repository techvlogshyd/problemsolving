package practice.neetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(minWindow2("ADOBECODEBANC", "ABC"));
    }

    public static String minWindow(String s, String t) {
        if (t.isEmpty()) {
            return "";
        }
        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char ch : t.toCharArray()) {
            countT.put(ch, 1 + countT.getOrDefault(ch, 0));
        }

        int have = 0;
        int need = countT.size();

        int[] result = {-1, -1};
        int resultLength = Integer.MAX_VALUE;

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            window.put(ch, 1 + window.getOrDefault(ch, 0));

            if (countT.containsKey(ch) && window.get(ch) == countT.get(ch)) {
                have++;
            }

            while (have == need) {
                if (right - left + 1 < resultLength) {
                    result = new int[]{left, right};
                    resultLength = right - left + 1;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                if (countT.containsKey(s.charAt(left)) && window.get(s.charAt(left)) < countT.get(s.charAt(left))) {
                    have--;
                }
                left++;
            }
        }
        int leftIdx = result[0];
        int rightIdx = result[1];
        return resultLength != Integer.MAX_VALUE ? s.substring(leftIdx, rightIdx + 1) : "";
    }
    public static String minWindow2(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : t.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int matched = 0;
        int start = 0;
        int minLen = s.length() + 1;
        int subStr = 0;
        for (int endWindow = 0; endWindow < s.length(); endWindow++) {
            char right = s.charAt(endWindow);
            if (map.containsKey(right)) {
                map.put(right, map.get(right) - 1);
                if (map.get(right) == 0) matched++;
            }

            while (matched == map.size()) {
                if (minLen > endWindow - start + 1) {
                    minLen = endWindow - start + 1;
                    subStr = start;
                }
                char deleted = s.charAt(start++);
                if (map.containsKey(deleted)) {
                    if (map.get(deleted) == 0) matched--;
                    map.put(deleted, map.get(deleted) + 1);
                }
            }
        }
        return minLen > s.length() ? "" : s.substring(subStr, subStr + minLen);
    }
}
