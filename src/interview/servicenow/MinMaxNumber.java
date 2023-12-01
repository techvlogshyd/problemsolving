package interview.servicenow;

//12. Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array
//        Example 1:
//        Input:
//        N= 6
//        A[] = (3, 2, 1, 56, 10000, 167)
//        Output:
//        min = 1, max = 10000
public class MinMaxNumber {
    public static void main(String[] args) {
        minMax(new int[]{3, 2, 1, 56, 10000, 167});
    }
    static void minMax(int[] nums){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max,num);
        }
        System.out.println(min);
        System.out.println(max);
    }
}
