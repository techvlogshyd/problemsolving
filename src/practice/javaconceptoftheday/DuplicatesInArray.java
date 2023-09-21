package practice.javaconceptoftheday;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] inputArray = new int[]{111, 333, 555, 777, 333, 444, 555};
        System.out.println("======Duplicates Using Brute Force======");
        findDuplicatesUsingBruteForce(inputArray);
        findDuplicatesUsingSorting(inputArray);
        findDuplicatesUsingHashSet(inputArray);
        findDuplicatesUsingHashSet(inputArray);
        findDuplicatesUsingHashMap(inputArray);
        findDuplicatesUsingJava8(inputArray);
    }

    private static void findDuplicatesUsingBruteForce(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    System.out.println("Duplicate using Brute Force:" + inputArray[i]);
                }
            }
        }
    }

    private static void findDuplicatesUsingSorting(int[] inputArray) {
        Arrays.sort(inputArray);
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] == inputArray[i + 1]) {
                System.out.println("Duplicate Using Sorting:" + inputArray[i]);
            }
        }
    }

    private static void findDuplicatesUsingHashSet(int[] inputArray) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (!numbers.add(inputArray[i])) {
                System.out.println("Duplicate Using HashSet:" + inputArray[i]);
            }
        }
    }

    private static void findDuplicatesUsingHashMap(int[] inputArray) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int input : inputArray) {
            if (!numbers.containsKey(input)) {
                numbers.put(input, 1);
            } else {
                numbers.put(input, numbers.get(input) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Using HashMap:" + entry.getKey());
            }
        }
    }

    private static void findDuplicatesUsingJava8(int[] inputArray) {
        Set<Integer> uniqueElements = new HashSet<>();

        Set<Integer> duplicateElements = Arrays.stream(inputArray)
                .filter(i -> !uniqueElements.add(i))
                .boxed()
                .collect(Collectors.toSet());

        System.out.println(duplicateElements);
    }

}
