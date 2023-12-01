package interview.servicenow;

import java.util.ArrayList;
import java.util.List;

//6. Find the maximum number in each row and perform addition on max numbers
//        Input:
//        3
//        7 4
//        2 4 6
//        8 5 9 3
//        Output: 25
//        Explanation: 3 + 7 + 6 + 9 = 25
public class RowMaxSum {
    public static void main(String[] args) {
        maxSum(new int[][]{{3},
                {7, 4},
                {2, 4, 6},
                {8, 5, 9, 3}
        });
    }
    static void maxSum(int[][] nums){
        List<Integer> maxNums = new ArrayList<>();
        int n = nums.length;
        int sum = 0;
        int i = 0;
        while(i < n){
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j] > max){
                    max = nums[i][j];
                }
            }
            maxNums.add(max);
            sum += max;
            i++;
        }
        System.out.println(maxNums);
        System.out.println(sum);
    }
}
