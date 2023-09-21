package practice.problems;

import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {
       //Occupies same amount of space in memory
        //Fixed in size
        //Fast in access an known index
        int[] numbers=new int[8];
        numbers[0]=71;
        numbers[1]=62;
        numbers[2]=51;
        numbers[3]=42;
        numbers[4]=31;
        numbers[5]=32;
        numbers[6]=21;
        numbers[7]=12;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        sortArray(numbers);
        System.out.println("After sort::");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
    public static void sortArray(int[] input){
        Arrays.sort(input);
    }

}
