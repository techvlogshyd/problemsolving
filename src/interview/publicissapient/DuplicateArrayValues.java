package interview.publicissapient;

import java.util.HashMap;
import java.util.Map;

public class DuplicateArrayValues {
    public static void main(String[] args) {
// Example array with duplicate values
        Integer[] numbers = {1, 2, 3, 4, 2, 5, 3, 6, 3, 7, 8, 2};
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};

        // Count duplicates
        Map<Integer, Integer> duplicatesIntegers = getDuplicateArrayValues(numbers);

        // Print results
        System.out.println("Duplicate integr values and their counts:");
        for (Map.Entry<Integer, Integer> entry : duplicatesIntegers.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
        }

        Map<String, Integer> duplicatesString = getDuplicateArrayValues(words);
        // Print results
        System.out.println("Duplicate string values and their counts:");
        for (Map.Entry<String, Integer> entry : duplicatesString.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
        }
    }

    public static <T> Map<T, Integer> getDuplicateArrayValues(T[] array){
        Map<T, Integer> count = new HashMap<>();
        Map<T, Integer> duplicateCount = new HashMap<>();
        for(T value : array){
            count.put(value, count.getOrDefault(value, 0) + 1);
        }
        for(Map.Entry<T, Integer> entry : count.entrySet()){
            if(entry.getValue() > 1){
                duplicateCount.put(entry.getKey(), entry.getValue());
            }
        }
        return duplicateCount;
    }
}
