package practice.sorting;

import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static List<Integer> sortNumbers(List<Integer> numbers){
        for (int i = 1; i < numbers.size(); i++) {
            int inspected=numbers.get(i);
            int beforeIndex=i-1;
            while (beforeIndex>=0 && inspected<numbers.get(beforeIndex)){
                numbers.set(beforeIndex+1,numbers.get(beforeIndex));
                beforeIndex--;
            }
        numbers.set(beforeIndex+1,inspected);
        }
        return numbers;
    }
    public static void main(String[] args) {
        Integer[] values = {73,67,38,33,19,2,8,3,7,4};
        System.out.println(sortNumbers(Arrays.asList(values)));
        System.out.println(BubbleSort.sortNumbers(Arrays.asList(values)));
    }
}
