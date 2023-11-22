package practice.javaconceptoftheday.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class CharacterOccurrences {
    public static void main(String[] args) {
        String input = "Java is java again java again";
        charOccurrence(input);
    }

    static void charOccurrence(String input) {
        Map<Character, Integer> charOccurrence = new HashMap<>();
        for(char ch : input.toCharArray()){
            charOccurrence.put(ch, charOccurrence.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (entry1, entry2) -> entry2.getValue() - entry1.getValue()
        );
        pq.addAll(charOccurrence.entrySet());
        for(Map.Entry<Character, Integer> entry : pq){
            if (entry.getKey() != ' ')
            System.out.println(entry.getKey()+" occurred "+entry.getValue()+" times.");
        }
    }
}
