package practice.problems;

import java.util.ArrayList;
import java.util.List;

public class ReverseEachIntegerInArray {

    public static void reversedIntegerArray(int[] input){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <input.length ; i++) {
            if (!list.contains(input[i]))
            list.add(reverseInteger(input[i]));
        }
        System.out.println(list);
    }

    private static int reverseInteger(int numberToReverse) {
        int remainder=0, reverse =0,temp=numberToReverse;
            while(numberToReverse!=0){
                remainder = numberToReverse % 10;
                reverse=(reverse*10)+remainder;
                numberToReverse/=10;
            }
            return reverse;
        }

    public static void main(String[] args) {
        int[] numbers={10,121,121,02,567};
        reversedIntegerArray(numbers);
    }
}
