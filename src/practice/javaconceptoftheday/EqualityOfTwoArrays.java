package practice.javaconceptoftheday;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EqualityOfTwoArrays {
    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 1, 7, 4};
        int[] arrayTwo = {2, 5, 1, 4, 7};
        System.out.println(areArraysEqual(arrayOne, arrayTwo));
        System.out.println(areArraysEqualUsingList(arrayOne,arrayTwo));
    }

    private static boolean areArraysEqual(int[] arrayOne, int[] arrayTwo) {
        if (arrayOne.length != arrayTwo.length) {
            return false;
        }
        if (Arrays.equals(arrayOne, arrayTwo)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean areArraysEqualUsingList(int[] arrayOne, int[] arrayTwo) {
        List<Integer> result = Arrays.stream(arrayOne).boxed().collect(Collectors.toList());
        for (int number : arrayTwo) {
           if(result.contains(number)) {
               result.remove(Integer.valueOf(number));
           }
        }
        return result.isEmpty();
    }
}
