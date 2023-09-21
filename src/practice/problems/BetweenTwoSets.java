package practice.problems;

import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {
    /*
    * In this, Between Two Sets problem, There will be two arrays of integers. Determine all integers that satisfy the following two conditions:

    The elements of the first array are all factors of the integer being considered
    The integer being considered is a factor of all elements of the second array

These numbers are referred to as being between the two arrays. Determine how many such numbers exist.
    *
    * */
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int cnt = 0;
        for (int i = 1; i <= 100; i++) {
            boolean isFactor = true;
            for (int j = 0; j < a.size() && isFactor; j++) {
                if (i % a.get(j) != 0) isFactor = false;
            }
            for (int j = 0; j < b.size() && isFactor; j++) {
                if (b.get(j) % i != 0) isFactor = false;
            }
            if (isFactor) cnt++;
        }
        return cnt;

    }

    public static void main(String[] args) {
        Integer[] transaction1 = {2,4};
        Integer[] transaction2 = {16,32,96};

        System.out.println(getTotalX(Arrays.asList(transaction1),Arrays.asList(transaction2)));
    }
}
