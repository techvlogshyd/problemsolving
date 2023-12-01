package interview.servicenow;

import java.util.Arrays;
import java.util.Stack;

public class MoveNegativeElements {

//    3. Given an unsorted array arr[] of size N having both negative and positive integers.
//    The task is place all negative element at the end of array without changing the order of positive element and negative element.
//    Example 1:
//    Input:
//    N=8
//    arr[i] = [1, -1, 3, 2, -7, -5, 11, 6]
//    Output:
//            1 3 2 11 6 -1 -7 -5
    public static void main(String[] args) {
        moveNegativeElements(new int[]{1, -1, 3, 2, -7, -5, 11, 6});
    }
    static void moveNegativeElements(int[] nums){
        Stack<Integer> positive = new Stack<>();
        Stack<Integer> negative = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0){
                negative.push(nums[i]);
            }
            else{
                positive.push(nums[i]);
            }
        }
        int i = nums.length-1;
        while(!negative.isEmpty()){
            nums[i] = negative.pop();
            i--;
        }
        while(!positive.isEmpty()){
            nums[i] = positive.pop();
            i--;
        }

        System.out.println(Arrays.toString(nums));
    }
}
