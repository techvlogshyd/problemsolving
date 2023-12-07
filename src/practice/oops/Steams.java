package practice.oops;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Steams {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Mango", "Kiwi");

        // Filtering elements that contain the letter 'a'
        List<String> result = fruits.stream().filter(fruit -> fruit.contains("a")).collect(Collectors.toList());

        System.out.println("Filtered Fruits: " + result);


        // Mapping each fruit to its length
        List<Integer> lengths = fruits.stream().map(String::length).collect(Collectors.toList());

        System.out.println("Lengths of Fruits: " + lengths);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Summing all elements
        int sum = numbers.stream().reduce(0, Integer::sum);

        System.out.println("Sum of Numbers: " + sum);


        // Sorting fruits alphabetically
        List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());

        System.out.println("Sorted Fruits: " + sortedFruits);


    }
}
