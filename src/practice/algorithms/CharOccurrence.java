package practice.algorithms;
import java.util.*;



public class CharOccurrence {
    public static void main(String[] args) {
        findRepeatingChars("interview");
    }
    static void findRepeatingChars(String input){
        // if(inp){

        // }
        Map<Character, Integer> frequency = new HashMap<>();
        for(char ch : input.toCharArray()){
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1) ;
        }
        Set<Map.Entry<Character, Integer>> entrySet = frequency.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }
        // a
        // int[] chars = new int[26];
        // a -'a' = 0
        // chars[ch-'a']++;
    }


}
