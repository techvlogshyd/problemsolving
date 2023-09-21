package practice.problems;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumbers {
    public static void removeDuplicates(int numbers[]){
        Set<Integer> uniqueValues=new HashSet<>();
        for (int i = 0; i <numbers.length ; i++) {
            uniqueValues.add(numbers[i]);
        }
        System.out.println(uniqueValues);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 10, 10, 20, 30, 40, 50, 60, 30 };
        removeDuplicates(arr);
    }
}
