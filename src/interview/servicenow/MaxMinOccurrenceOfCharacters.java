package interview.servicenow;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaxMinOccurrenceOfCharacters {
    public static void main(String[] args) {
        maxMin("AABBCCCDDDD");
    }
    static void maxMin(String input){
        Map<Character, Integer> frequency = new HashMap<>();
        for(char ch : input.toCharArray()){
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> max = new PriorityQueue<>(
                (entry1, entry2) -> (entry2.getValue() - entry1.getValue())
        );
        PriorityQueue<Map.Entry<Character, Integer>> min = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue)
        );
        max.addAll(frequency.entrySet());
        System.out.println(max.peek());
        min.addAll(frequency.entrySet());
        System.out.println(min.peek());
    }
}
