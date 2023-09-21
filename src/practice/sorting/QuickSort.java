package practice.sorting;

import java.util.Random;

//https://www.youtube.com/watch?v=h8eyY7dIiN4
public class QuickSort {
    public static void main(String[] args) {
        Random rand=new Random();
//        int[] numbers=new int[1000];
        int[] numbers=new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=rand.nextInt(10000);
        }
        System.out.println("Before quick sort::");
        printArray(numbers);

        quickSort(numbers);

        System.out.println("After quick sort::");
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    private static void quickSort(int[] inputArray) {
        quickSort(inputArray,0,inputArray.length-1);
    }
    private static void quickSort(int[] inputArray, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex){
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = inputArray[pivotIndex];
        swap(inputArray, pivotIndex, highIndex);

        int leftPointer = partition(inputArray,lowIndex,highIndex,pivot);

        quickSort(inputArray,lowIndex,leftPointer - 1);
        quickSort(inputArray,leftPointer + 1, highIndex);
    }

    private static int partition(int[] inputArray, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex, rightPointer = highIndex - 1;

        while(leftPointer < rightPointer){

            //Walk from the left until we find a number greater than the pivot, or hit the right pointer
            while (inputArray[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            //Walk from the right until we find a number less than the pivot, or hit left pointer
            while (inputArray[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

        swap(inputArray,leftPointer,rightPointer);
        }

        //fixes an issue where last value could potentially be out of order
        if(inputArray[leftPointer] > inputArray[highIndex]) {
            swap(inputArray, leftPointer, highIndex);
        }
        else{
            leftPointer = highIndex;
        }
        return leftPointer;
    }

    private static void swap(int[] inputArray, int index1, int index2) {
        int temp=inputArray[index1];
        inputArray[index1]=inputArray[index2];
        inputArray[index2]=temp;
    }

}
