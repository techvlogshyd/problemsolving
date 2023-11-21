package practice.javaconceptoftheday.strings;

import java.util.*;

public class DuplicateWords {
    public static void main(String[] args) {
        findDuplicateWords("test1 test2 test3 test4 test1 test3 test1");
        String inputString = "The quick brown fox jumps over the lazy dog. " +
                "In a world where technology is rapidly advancing, " +
                "data science and artificial intelligence are becoming crucial " +
                "for solving complex problems. " +
                "The future of AI is exciting, and we should embrace it.";

        int n = 3; // Change this to the desired value of N

        findTopNDuplicateWords(inputString, n);
    }
    static void findDuplicateWords(String input){
        Map<String, Integer> occurrences = new HashMap<>();
        for(String word : input.split(" ")){
            occurrences.put(word, 1 + occurrences.getOrDefault(word, 0));
        }
        Set<Map.Entry<String, Integer>> entrySet = occurrences.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " found " +entry.getValue()+" times");
            }
        }

    }
    static void findTopDuplicateWords(String input){
        Map<String, Integer> occurrences = new HashMap<>();
        for(String word : input.split(" ")){
            occurrences.put(word, 1 + occurrences.getOrDefault(word, 0));
        }
        Set<Map.Entry<String, Integer>> entrySet = occurrences.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " found " +entry.getValue()+" times");
            }
        }

    }
    static void findTopNDuplicateWords(String inputString, int n) {
        String[] words = inputString.split("\\s+");
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        // Create a priority queue to get the top N duplicate words
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (entry1, entry2) -> entry2.getValue() - entry1.getValue()
        );

        pq.addAll(wordFrequency.entrySet());

        // Print the top N duplicate words
        System.out.println("Top " + n + " duplicate words:");
        int count = 0;
        while (count < n && !pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();
            System.out.println(entry.getKey() + ": " + entry.getValue() + " occurrences");
            count++;
        }
    }

}
