package practice.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
colsToConsider
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int left = i + 1;
                int right = nums.length - 1;
                int sum = 0 - nums[i];

                while (left < right) {
                    if (nums[left] + nums[right] == sum) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] > sum) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};
//        List<List<Integer>> input= asList(asList(112,42,83,119),asList(56,125,56,49),asList(15,78,101,43),asList(63,98,114,106));
        System.out.println(threeSum(input));
    }
}
