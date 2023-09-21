package practice.sorting;

import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static List<Integer> sortNumbers(List<Integer> numbers){
        for (int i = 0; i < numbers.size()-1; i++) {
            int minIndex=i;
            for (int j = i+1; j < numbers.size(); j++) {
                if(numbers.get(j)<numbers.get(minIndex)) {
                    minIndex = j;
                }
                int temp=numbers.get(i);
                numbers.set(i,numbers.get(minIndex));
                numbers.set(minIndex,temp);
            }
        }
    return numbers;
    }
    public static void main(String[] args) {
        Integer[] values = {73,67,38,33,19,2,8,3,7,4};
        System.out.println(sortNumbers(Arrays.asList(values)));
        System.out.println(BubbleSort.sortNumbers(Arrays.asList(values)));
    }
}
