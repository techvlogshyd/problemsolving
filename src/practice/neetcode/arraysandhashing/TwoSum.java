package practice.neetcode.arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        for (int num : twoSum(new int[]{2,7,11,15},9) ) {
            System.out.print(num);
        }
        System.out.println();
        for (int num : twoSum(new int[]{2,3,11,7},9) ) {
            System.out.print(num);
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> positions = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(positions.containsKey(diff)){
                return new int[]{positions.get(diff),i};
            }
            else{
                positions.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
