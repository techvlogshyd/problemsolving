package interview.publicissapient;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharCount {
    public static void main(String[] args) {
        String input = "I am Prasanna from Hyderabad";
        for(Map.Entry<Character, Integer> entry : getDuplicateCharCount(input).entrySet()){
            System.out.println(entry.getKey() +" repeated for "+entry.getValue());
        }
    }

    public static Map<Character, Integer> getDuplicateCharCount(String input){
        Map<Character, Integer> charMap = new HashMap<>();
        Map<Character, Integer> duplicateCharMap = new HashMap<>();
        for (char c : input.toCharArray()){
            if(c == ' ')
                continue;
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : charMap.entrySet()){
            if (entry.getValue() > 1){
                duplicateCharMap.put(entry.getKey(), entry.getValue());
            }
        }
        return duplicateCharMap;
    }

}
