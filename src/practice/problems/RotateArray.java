package practice.problems;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args)
    {
//        System.out.println( Arrays.toString(rotateArrayLeft(new int[] { 1, 2, 3, 4, 5, 6, 7 },2)));
//        System.out.println( Arrays.toString(rotateArrayRight(new int[] { 1, 2, 3, 4, 5, 6, 7 },2)));
        System.out.println( Arrays.toString(rotateArrayLeft2(new int[] { 1, 2, 3, 4, 5, 6, 7 },2)));
    }
    public static int[] rotateArrayLeft(int[] inputArray, int rotations){
        int temp;
        for (int i = 0; i < rotations ; i++) {
            temp=inputArray[0];
            for (int j = 0; j < inputArray.length-1; j++) {
                inputArray[j]=inputArray[j+1];
            }
            inputArray[inputArray.length-1] = temp;
        }
        return inputArray;
    }
    public static int[] rotateArrayLeft2(int[] inputArray, int rotations){
       int n = inputArray.length;
        int result[] = new int[n];
        int counter = 0, resultCounter = 0;
        for(int i=rotations; i<n; i++){
            result[counter] = inputArray[i];
            counter++;
        }
        for(int j=n-rotations; j<n; j++){
            result[j] = inputArray[resultCounter];
            resultCounter++;
        }
        return result;
    }
    public static int[] rotateArrayRight(int[] inputArray, int rotations){
        int temp;
        for (int i = 0; i < rotations ; i++) {
            temp=inputArray[inputArray.length-1];
            for (int j = inputArray.length-1; j > 0; j--) {
                inputArray[j]=inputArray[j-1];
            }
            inputArray[0] = temp;
        }
        return inputArray;
    }
}
