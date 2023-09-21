package practice.problems;

import java.io.*;

public class CountSort {


    public static int[] countingSort(int arr[]) {
        // Write your code here
        int[] resultArr=new int[arr.length];
        int[] counterArray=new int[]{0,0,0,0};
        for (int i = 0; i < arr.length; i++) {
            counterArray[arr[i]]++;//0 3 1 1
        }
        for (int i = 1; i <counterArray.length; i++) {
            counterArray[i]+=counterArray[i-1]; //0 3 4 5
        }
        for (int i = arr.length-1; i>=0; i--) {
            resultArr[counterArray[arr[i]]-1] = arr[i];
            counterArray[arr[i]]--;
        }
        return resultArr;
    }
    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{1,1,3,2,1};
        for (int no:countingSort(arr)) {
            System.out.print(no);
        }
    }


}
