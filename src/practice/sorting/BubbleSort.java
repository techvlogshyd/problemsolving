package practice.sorting;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static List<Integer> sortNumbers(List<Integer> numbers){
        for (int i = 0; i < numbers.size()-1; i++) {
            for (int j = 0; j < numbers.size()-1-i; j++) {
                if(numbers.get(j)>numbers.get(j+1)){
                    int temp=numbers.get(j);
                    numbers.set(j,numbers.get(j+1));
                    numbers.set(j+1,temp);
                }
            }
        }
    return numbers;
    }
    public static void main(String[] args) {
        Integer[] values = {73,67,38,33,19,2,8,3,7,4};
        System.out.println(sortNumbers(Arrays.asList(values)));
        //o/p- [2, 3, 4, 7, 8, 19, 33, 38, 67, 73]
    }
}
